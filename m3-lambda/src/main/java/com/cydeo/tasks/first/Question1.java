package com.cydeo.tasks.first;

import com.cydeo.Apple;
import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class Question1 {


    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300, Color.GREEN));

        ApplePredicate2 applePredicate = (Apple apple) -> {
            String s;
            if (apple.getWeight() > 200) {
                s = "a heavy " + apple.getColor() + " apple";
            } else {
                s = "a light" + apple.getColor() + " apple";
            }
            return s;
        };

        prettyPrintApple(inventory, applePredicate);

        //ApplePredicate2 dene = (Apple apple) -> "an apple of " + apple.getWeight() + "g";

        //  prettyPrintApple(inventory, dene);

        prettyPrintApple(inventory, (Apple apple) -> "an apple of " + apple.getWeight() + "g");


    }


    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate2 predicate) {
        for (Apple apple : inventory) {
            String output = predicate.test(apple);
            System.out.println(output);
        }
    }

}
/*
Write a prettyPrintApple method that takes aList of Apples and that can be parameterized with multiple ways to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
    for(Apple apple : inventory){
        String output = ???.???(apple);
System.out.println(output); }
}
Sample Output :
A Light GREEN apple A Heavy RED apple A Light GREEN apple
Sample Output :
An apple of 80g An apple of 155g An apple of 120g
 */