package com.niit.ibm;

import java.util.Scanner;

public class FirstProject {

    public static void main(String[] args){
        System.out.println("Welcome to Java");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        catch(Exception e){
            System.out.println("Enter only number");
        }
    }

}
