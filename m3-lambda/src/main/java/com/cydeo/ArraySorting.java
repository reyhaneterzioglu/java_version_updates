package com.cydeo;

import java.util.function.Predicate;

public class ArraySorting { // QuickSort, BubbleSort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = ()-> System.out.println("quick sort");
        as.sort(quickSort); // directly passing the action
        as.sort( ()-> System.out.println("quick sort")); // no more in need for QuickSort and BubbleSort classes

        // with java 8 - you have access to a bunch of ready functional interfaces


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }

}
