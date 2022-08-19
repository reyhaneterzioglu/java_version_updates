package com.cydeo.task;

import java.util.Comparator;
import java.util.stream.Stream;

import static com.cydeo.task.DishData.getAll;
import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        // print all dish's name that has less than 400 calories

        getAll().stream()
                .filter(i -> i.getCalories() < 400)
                .forEach(i -> System.out.println(i.getName()));

        //OR

        getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)// dish -> dish.getName()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        // print the length of the name of each dish

        getAll().stream()
                .map(i -> i.getName().length())
                .forEach(System.out::println); // soutc for shortcut

        //OR

        getAll().stream()
                .map(Dish::getName)
                .map(String::length) // dish -> dish.length()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        // print three high caloric dish name (>300)

        getAll().stream()
                .filter(i -> i.getCalories() > 300)
                .limit(3)
                .forEach(i -> System.out.println(i.getName()));

        //OR

        getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        // print all dish name that are below 400 calories in sorted

        getAll().stream()
                .filter(i -> i.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .forEach(i -> System.out.println(i.getName()));

        //OR

        Stream<String> stream = getAll().stream()// its now not Stream<Dish> because last line we turned everything to their name which are String
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories)) //Comparator.comparing - before static import
                .map(Dish::getName); // i need to do the sorting before this step because at this line I will only have names and can no longer access the calories
        //   .forEach(System.out::println);
        stream.forEach(System.out::println);




    }

}
