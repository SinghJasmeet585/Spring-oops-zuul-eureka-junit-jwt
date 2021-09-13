package com.niit.project;

import java.util.Scanner;

public class ItemMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Name:");
        String name=scanner.nextLine();
        System.out.println("Deposit:");
        Double deposit= scanner.nextDouble();
        System.out.println("Cost per Day");
        Double costPerDay= scanner.nextDouble();
        System.out.println("Number of days:");
        int numberOfDays=scanner.nextInt();

        ItemType stallone=new ItemType();
        stallone.setName(name);
        stallone.setDeposit(deposit);
        stallone.setCostPerDay(costPerDay);

        ItemTypeBO stallBO=new ItemTypeBO();
        System.out.println("The total cost is Rs." + stallBO.calculateCost(stallone,numberOfDays));
    }
}
