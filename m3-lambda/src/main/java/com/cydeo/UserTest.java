package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Pollard", 55));

        // print all elements  in the list
        printName(users, user -> true);

        System.out.println("--------------------------------------------------");

        // another way
        users.forEach(user -> System.out.println(user));

        System.out.println("--------------------------------------------------");

        //another way, but it prints the list
        Consumer<List<User>> consumer = user -> System.out.println(user);
        consumer.accept(users);

        System.out.println("--------------------------------------------------");

        //print all people that last name start with E
        printName(users, user -> user.getLastName().startsWith("E"));

        System.out.println("--------------------------------------------------");

        //another way
        users.forEach(user -> {
            if (user.getLastName().startsWith("E")) {
                System.out.println(user);
            }
        });

        System.out.println("--------------------------------------------------");

        //another way, without method
        Predicate<User> predicate = user -> user.getLastName().startsWith("E");

        for (User user : users) {
            if (predicate.test(user)) {
                System.out.println(user);
            }
        }

        System.out.println("--------------------------------------------------");

        // another way
        Consumer<List<User>> consumer1 = users1 -> {
            for (User user : users1) {
                if (user.getLastName().startsWith("E")){
                    System.out.println(user);
                }
            }

        };

        consumer1.accept(users);

    }


    private static void printName(List<User> users, Predicate<User> p) {

        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user);
            }
        }


    }
}
