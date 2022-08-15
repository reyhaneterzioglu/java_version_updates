package com.cydeo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("how to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c); // DIME
        System.out.println(Currency.PENNY); // PENNY

        Currency[] currencies = Currency.values();

        System.out.println(Arrays.toString(currencies));

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("how to use switch cases with enums");

        //  Currency myCurrency =
        switch(Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }


        System.out.println("operation task");
        calculate(2, 4, Operation.PLUS); //&

        System.out.println("how to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal()); // index of quarter
    }

    private static void calculate(double x, double y, Operation operation) {
        switch (operation) {

            case PLUS:
                System.out.println(x + y);
                break;

            case MINUS:
                System.out.println(x - y);
                break;

            case MULTIPLY:
                System.out.println(x * y);
                break;

            case DIVIDE:
                System.out.println(x / y);

        }

    }
}