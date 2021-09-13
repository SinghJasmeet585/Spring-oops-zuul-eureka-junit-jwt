package com.niit.overiding;

public class MainTwo {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        System.out.println(laptop.specification("latitude"));

        Dell dell = new Dell();
        String s = dell.specification("dell");
        System.out.println(s);
    }
}
