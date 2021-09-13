package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice = ");
        int ch=Integer.parseInt(reader.readLine());
        switch (ch){
            case 1:
                System.out.println("Savings Account");
                SavingsAccount save = new SavingsAccount();
                System.out.println("Account Name = ");
                save.setAccName(reader.readLine());
                System.out.println("Account Number = ");
                save.setAccNo(reader.readLine());
                System.out.println("Bank Name = ");
                save.setBankName(reader.readLine());
                System.out.println("Organization name = ");
                save.setOrgName(reader.readLine());
                save.display();
                break;
            case 2:
                System.out.println("Current Account");
                CurrentAccount curr = new CurrentAccount();
                System.out.println("Account Name = ");
                curr.setAccName(reader.readLine());
                System.out.println("Account Number = ");
                curr.setAccNo(reader.readLine());
                System.out.println("Bank Name = ");
                curr.setBankName(reader.readLine());
                System.out.println("Tin Number name = ");
                curr.setTinNumber(reader.readLine());
                curr.display();
                break;
        }
    }
}
