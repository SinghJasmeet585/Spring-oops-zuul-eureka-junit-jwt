package com.niit.project;

import com.niit.project.StallCategory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the stall category:");
        String name=scanner.nextLine();
        System.out.println("Enter the details of the stall category:");
        String detail=scanner.nextLine();

        System.out.println("Using Default Constructor");
        StallCategory stall1=new StallCategory();
        stall1.setName(name);
        stall1.setDetail(detail);
      //  stall1.name=name;
      //  stall1.detail=detail;
        stall1.display();

        //System.out.println("Using Parameterised Constructor");
        //StallCategory stall2=new StallCategory(name,detail);
        //stall2.display();

        StallCategory stall2=new StallCategory();
        stall2.setName(name);
        stall2.setDetail(detail);
        stall2.display();

    }
}
