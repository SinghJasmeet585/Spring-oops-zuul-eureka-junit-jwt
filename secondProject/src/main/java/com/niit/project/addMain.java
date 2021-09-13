package com.niit.project;

import java.util.Scanner;

public class addMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Address Line 1:");
        String getAddLine1= scanner.nextLine();
        System.out.println("Enter Address Line 2:");
        String getAddLine2= scanner.nextLine();
        System.out.println("Enter City:");
        String getCity= scanner.nextLine();
        System.out.println("Enter State:");
        String getState= scanner.nextLine();
        System.out.println("Enter Pincode:");
        int getPincode = scanner.nextInt();

        Address first=new Address();
        first.setAddressLine1(getAddLine1);
        first.setAddressLine2(getAddLine2);
        first.setCity(getCity);
        first.setState(getState);
        first.setPincode(getPincode);

        first.display();
    }
}
