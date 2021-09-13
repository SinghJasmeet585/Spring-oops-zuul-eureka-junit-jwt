package com.niit.ibm;

import java.util.Scanner;

public class cityOperatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = scanner.nextLine();
        cityOperator city_one = new cityOperator();

        if (string.contains("\"")) {
            String[] split = string.split(" ");
            if (split.length == 3) {
                city_one.setCity(split[0]);
                city_one.setOperator(split[1]);
                city_one.setCityName(split[2].substring(1, split[2].length() - 1));
                System.out.println(city_one);
            } else {
                city_one.setCity(split[0]);
                city_one.setOperator(split[1].substring(0, 1));
                city_one.setCityName(split[1].substring(2, split[1].length() - 1));
                System.out.println(city_one);
            }
        } else {
            String[] split = string.split(" ");
            if (split.length == 3) {
                city_one.setCity(split[0]);
                city_one.setOperator(split[1]);
                city_one.setCityName(split[2].substring(0, split[2].length()));
                System.out.println(city_one);
            } else {
                city_one.setCity(split[0]);
                city_one.setOperator(split[1].substring(0, 1));
                city_one.setCityName(split[1].substring(1, split[1].length()));
                System.out.println(city_one);
            }
        }
    }
}
