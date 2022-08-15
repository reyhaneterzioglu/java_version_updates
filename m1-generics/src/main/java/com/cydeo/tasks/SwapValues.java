package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        String[] arr = {"reyhan", "hira", "nora", "mohammed", "lucy"};

        Integer[] a = {1, 2, 3, 4};

        System.out.println(Arrays.toString(swap(a, 0,2)));


        System.out.println(Arrays.toString(swap(arr, 0, 3)));

    }


    public static <T> T[] swap(T[] arr, int index, int index2) { // can be void too

        T temp = arr[index];

        arr[index] = arr[index2];

        arr[index2] = temp;

        return arr;

    }
}
/*
Write a generic method to exchange the positions of two different elements in array.
Sample output:
Integer[] a = {1,2,3,4};
swap(a,0,2); System.out.println(Arrays.toString(a)); //[3,2,1,4]
 */