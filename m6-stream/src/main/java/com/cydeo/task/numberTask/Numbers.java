package com.cydeo.task.numberTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        /*
        1. Given a list of numbers how would you return a list of the square of each number?
         For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
          */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        System.out.println(result);

        System.out.println("---------------------------------------------------------");

        /*
        2. Given two lists of numbers, how would you return all pairs of numbers?
        For example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3), (2,4),(3,3),(3,4)]
        • List<Integer> numbers1 = Arrays.asList(1,2,3);
        • List<Integer> numbers2 = Arrays.asList(3,4);
        • List<int[]> pairs = ?????
         */

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3,4);

       /* numbers1.stream()
                .flatMap();

        */


    }


}
