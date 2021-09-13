package com.niit.ibm;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = scanner.nextLine();
        // if a>b and a>c print a is greater
        // if a>b a is greater
        if(string.contains("and")) {
            String[] split = string.split("and");
            String[] split1 = split[0].split(" ");
            String[] split2 = split[1].split(" ");
            System.out.println(split1[1]);
            System.out.println(split2[1]);
        }else if(string.contains("or")){
            String[] split = string.split("or");
            String[] split1 = split[0].split(" ");
            String[] split2 = split[1].split(" ");
            System.out.println(split1[1]);
            System.out.println(split2[1]);
        }else{
            String[] split = string.split(" ");
            System.out.println(split[1].trim());
        }

    }
}
