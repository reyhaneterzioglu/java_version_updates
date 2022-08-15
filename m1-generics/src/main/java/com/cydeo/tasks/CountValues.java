package com.cydeo.tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class CountValues {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 4, 1, 1, 1, 7, 8, 9);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);


    }

    public static <T> int countIf(List<T> d, UnaryPredicate<T> e) {
        int count = 0;
        for (T element : d) {
            if (e.test(element)) {
                ++count;
            }
        }

        return count;

    }
}
/*
Write a generic method to count the number of elements in a collection that
have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:
public interface UnaryPredicate<T> {
    public boolean test(T obj);
}
Sample output:
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate()); System.out.println("Number of odd integers = " + count);
 */