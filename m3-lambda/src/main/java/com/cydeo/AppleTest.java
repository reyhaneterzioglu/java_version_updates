package com.cydeo;

import com.cydeo.tasks.first.Orange;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        //inventory.forEach(apple -> System.out.println(apple));

        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println("heavyApple = " + heavyApple);

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println("greenApple = " + greenApple);

        ApplePredicate weightApple = (Apple apple) -> apple.getWeight() > 200;

        filterApples(inventory, weightApple);
        // or
        filterApples(inventory, (Apple apple) -> apple.getWeight() > 200);

        System.out.println("------------------------------------------------");

        // solution by using the built-in functional interface
        //heavy apples
        Predicate<Apple> predicate = apple -> apple.getWeight() > 200;
        System.out.println(filterApplesWithFuncInt(inventory, predicate)); // need to put in print because it's returning a list, not void

        //green apples
        List<Apple> apples = filterApplesWithFuncInt(inventory, apple -> apple.getColor() == Color.GREEN);
        // you can directly pass to print statement or assign to a list before
        System.out.println(apples);


    }

    //by using custom interface
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;

    }

    //by using built-in functional interface
    private static List<Apple> filterApplesWithFuncInt(List<Apple> inventory, Predicate<Apple> predicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;

    }
}
