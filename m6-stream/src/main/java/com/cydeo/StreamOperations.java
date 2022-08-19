package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2);

        // list.forEach(x-> System.out.println(x));
        // list.forEach(System.out::println);


        System.out.println("filter:");

        list.stream() // here i cant assign to a stream because at the end of the statement I closed it, forEach method is void not Stream
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //------------------------------------------------------------------

        System.out.println("distinct:");

        Stream<Integer> str = list.stream() // can be assigned to a stream because we don't close it in this statement
                .filter(i -> i % 2 == 0)
                .distinct(); // stream still not closed

        str.forEach(System.out::println); // closed now

        //------------------------------------------------------------------

        System.out.println("limit:");

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        //------------------------------------------------------------------

        System.out.println("skip:");

        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        //------------------------------------------------------------------

        System.out.println("map:");

        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 3)  // action/change on each object after filtering
                .forEach(System.out::println);

        //another ex
        list.stream()
                .map(number -> number * 2)
                .filter(i -> i % 3 == 0) // you can decide the order
                .forEach(System.out::println);


    }
}
