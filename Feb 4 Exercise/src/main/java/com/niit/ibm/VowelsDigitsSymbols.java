package com.niit.ibm;

import java.util.Scanner;

public class VowelsDigitsSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String city1 = scanner.nextLine();

        int vowels=0,digits=0,symbols=0;
        for (int i=0;i<city1.length();i++){
            if(city1.charAt(i)=='A' || city1.charAt(i)=='E'
                    || city1.charAt(i)=='I' || city1.charAt(i)=='O'
                    || city1.charAt(i)=='U' || city1.charAt(i)=='a'
                    || city1.charAt(i)=='e' || city1.charAt(i)=='i'
                    || city1.charAt(i)=='o' || city1.charAt(i)=='u'){
                vowels++;
            }else if(city1.charAt(i) >= '0' && city1.charAt(i) <='9'){
                digits++;
            }else{
                symbols++;
            }
        }
        System.out.println("Vowels="+vowels);
        System.out.println("Digits="+digits);
        System.out.println("Symbols="+symbols);
    }
}
