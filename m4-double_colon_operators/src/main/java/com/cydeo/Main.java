package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Calculate sum = (x, y) -> System.out.println(x + y);

        Calculate s1 = (x, y) -> Calculator.findSum(x, y);

        // reference to a static method
        Calculate s2 = Calculator::findSum;
        s2.calculate(10, 20);

        /**----------------------------------------------------------------*/


        Calculate multiply = (x, y) -> System.out.println(x * y); // giving lambda implementation

        // reference to an instance method

        Calculator obj = new Calculator();

        Calculate s3 = (x, y) -> obj.findMultiply(x, y); // calling the method from another place that already has the implementation I need

        Calculate s4 = obj::findMultiply; // calling that method without giving args again by method reference

        Calculate s5 = new Calculator()::findMultiply; // same as above but if you dont want to do it in two steps by using variable for the object

        /**----------------------------------------------------------------*/

        // example with built-in functional interface ( BiFunction ) and built-in method ( substring )

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String::substring;

        // substring is not static method, but we mention the String return type in <> so you can use the Class name before ::

        Function<Integer, Double> b = new MyClass()::method;
        b.apply(3);

        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;
        b1.apply(new MyClass(), 3);


        /**----------------------------------------------------------------*/

        Consumer<Integer> display = i -> System.out.println(i); // out is static - printStream.println()

        Consumer<Integer> display1 = System.out::println;

        /**----------------------------------------------------------------*/

        // with constructor in CarTest class
    }
}
