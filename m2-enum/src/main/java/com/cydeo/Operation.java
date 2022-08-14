package com.cydeo;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE; // each constant is object (new) of operation

    Operation() { //private
        System.out.println("construction");
    }
}


