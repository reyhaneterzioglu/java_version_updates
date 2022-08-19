package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        System.out.println("print the number of characters for each word:");

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .map(String::length) // .map( str -> str.length() )
                .forEach(System.out::println); //.forEach(i -> System.out.println(i));


    }
}
