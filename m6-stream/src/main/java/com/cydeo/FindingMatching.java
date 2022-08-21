package com.cydeo;

import com.cydeo.task.Dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

import static com.cydeo.task.DishData.getAll;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("ALL MATCH:");

        boolean isHealthy = getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000); // returns boolean

        System.out.println(isHealthy);

        //---------------------------------------------------

        System.out.println("ANY MATCH:");

        if (getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("the menu is vegetarian friendly");
        }

        //---------------------------------------------------

        System.out.println("NONE MATCH:");

        boolean isHealthy2 = getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);

        System.out.println(isHealthy2);

        //---------------------------------------------------

        System.out.println("FIND ANY:");

        Optional<Dish> dish = getAll().stream().filter(Dish::isVegetarian).findAny();

        System.out.println(dish.get()); //Dish(name=fries, vegetarian=true, calories=530, type=OTHER)
        //get() from Optional class, we use it to get Dish object instead of Optional
        System.out.println(dish); // Optional[Dish(name=fries, vegetarian=true, calories=530, type=OTHER)]

        //---------------------------------------------------

        System.out.println("FIND FIRST:");

        Optional<Dish> dish2 = getAll().stream().filter(Dish::isVegetarian).findFirst();

        System.out.println(dish2.get());

        //---------------------------------------------------

        System.out.println("PARALLEL STREAMS ( ASYNC )");

        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        int a = IntStream.range(0, 100).parallel().findAny().getAsInt();

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        //list1.stream().parallel()

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //---------------------------------------------------

        System.out.println("MIN:");

        // getAll().stream().sorted().findFirst();
        //getAll().stream().sorted().limit(1);
        Optional<Dish> dMin = getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        //---------------------------------------------------

        System.out.println("MAX:");

        Optional<Dish> dMax = getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());


    }


}
