package com.niit.ibm;

import java.util.Locale;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String name="Vijay";
        String city1 = "Chennai23";
        String city2=new String("Chennai");
        String city3="Chennai";
        String city4=new String("Chennai");
        String city5="Delhi";
    //   char city3[] = {'C','h','e','n','n','i'};

        System.out.println(city1==city3);
        System.out.println(city1==city5);
        System.out.println(city1.equals(city2));
        System.out.println(city1==city2);
/*
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        String lower=name.toLowerCase();
        System.out.println(lower);
        System.out.println(name.toUpperCase());
        String upper=name.toUpperCase();
        System.out.println(upper);
        System.out.println(name.substring(2));
        System.out.println(name.substring(0,4));
        System.out.println(name.concat("Kumar"));
        String concat=name.concat("Kumar");
        System.out.println(name.contains("ij"));
        System.out.println(name.contains("Kumar"));

 */

    }
}
