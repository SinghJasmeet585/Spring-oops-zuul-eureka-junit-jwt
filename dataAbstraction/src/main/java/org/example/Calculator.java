package org.example;

public abstract class Calculator {

    //create four abstract method with return / parameter

    // two abstract methods - contains no body
    abstract int addition(int a,int b);
    abstract int subtraction(int a,int b);

    //two non abstract methods - contains body
    long  multiplication(int a,int b){
        return a * b;
    }
    double division(int a,int b){
        return a / b;
    }
}
