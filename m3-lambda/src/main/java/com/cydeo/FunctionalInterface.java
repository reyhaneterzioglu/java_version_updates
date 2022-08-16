package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {


        // anonymous class
        ApplePredicate ap = new ApplePredicate() { // AppleHeavyPredicate class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };


        System.out.println("**************PREDICATE**************");

        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));

        // lesserThan = i -> i == 5;

        System.out.println("**************CONSUMER**************");

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10); //it void, so no need to put in the print statement again

        System.out.println("**************BI CONSUMER**************");

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);

        System.out.println("**************FUNCTION**************");

        Function<Integer, Integer> d = I -> I + 2;
        System.out.println(d.apply(5));

        Function<String, String> fun = s -> "hello" + s;
        System.out.println(fun.apply("cydeo"));

        System.out.println("**************BI FUNCTION**************");
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        System.out.println(func.apply(2, 3));

        System.out.println("**************SUPPLIER**************");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Supplier<Character> randomValdue = () -> "re".charAt(4);

    }

}
