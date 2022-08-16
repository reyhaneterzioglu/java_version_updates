package com.cydeo.tasks.first;

import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(80, Color.RED));

        OrangeFormatter orangeFormatter = orange -> {
            String s;
            if (orange.getWeight() > 100) {
                s = "a heavy " + orange.getColor() + " Apple";
            } else {
                s = "a light " + orange.getColor() + " Apple";
            }
            return s;
        };

     /*   OrangeFormatter fancyFormatter = orange ->{
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return  "A" + ch + " " + orange.getColor() + " orange";
        };

        prettyPrintApple(inventory, fancyFormatter);

      */

        prettyPrintApple(inventory, orangeFormatter);


        System.out.println("-------------------------------");


        //  OrangeFormatter orangeLambda = orange -> "an Orange of " + orange.getWeight() + "g";
        //prettyPrintApple(inventory, orangeLambda);


        prettyPrintApple(inventory, orange -> "an Orange of " + orange.getWeight() + "g");


    }


    public static void prettyPrintApple(List<Orange> inventory, OrangeFormatter formatter) {
        for (Orange orange : inventory) {
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }

}
/*
Write a prettyPrintApple method that takes aList of Apples and that can be parameterized with multiple ways to generate a String output from an Apple
public static void prettyPrintApple(List<Apple> inventory, ???){
    for(Apple Apple : inventory){
        String output = ???.???(Apple);
System.out.println(output); }
}
Sample Output :
A Light GREEN Apple A Heavy RED Apple A Light GREEN Apple
Sample Output :
An Apple of 80g An Apple of 155g An Apple of 120g
 */