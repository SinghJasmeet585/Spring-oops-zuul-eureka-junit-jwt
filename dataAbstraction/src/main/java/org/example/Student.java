package org.example;

public class Student extends Calculator{

    @Override
    int addition(int a, int b) {
        return a + b;
    }

    @Override
    int subtraction(int a, int b) {
        return a - b;
    }
}
