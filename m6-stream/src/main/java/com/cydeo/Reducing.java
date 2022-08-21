package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        // one way
        int sum1 = 0;
        for (Integer number : numbers) {
            sum1 = sum1 + number;
        }

        System.out.println(sum1);

        // better way
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b); // returns Optional without initial value
        //  int result = numbers.stream().reduce(0, Integer::sum);

        System.out.println(result);

        System.out.println("----------------------------------------------------------------");

        System.out.println("dish calories total:");

        int calTotal = DishData.getAll()
                .stream().
                map(Dish::getCalories)
                .reduce(0, (a, b) -> a + b);

        System.out.println(calTotal);

        int calTotal2 = DishData.getAll()
                .stream().
                map(Dish::getCalories)
                .reduce((a, b) -> a + b) // default initial value is also 0
                // .reduce(Integer::sum)
                .get(); // get() because without initial value its Optional ( you could add it to the print statement as well like calTotal2.get())

        System.out.println(calTotal2);

        System.out.println("----------------------------------------------------------------");

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);

        System.out.println("----------------------------------------------------------------");

        // COUNT

        long dishCount = DishData.getAll().stream().filter(p -> p.getName().startsWith("p")).count();
        System.out.println(dishCount);


    }
}
