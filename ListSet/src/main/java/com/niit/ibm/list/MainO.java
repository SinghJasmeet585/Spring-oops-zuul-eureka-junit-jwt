package com.niit.ibm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ch;
        int itemCount=0;
        List<ItemType> listItem = new ArrayList<>();
        do {
            ItemType tempItem = new ItemType();
            System.out.println("Enter the details of item type " + (itemCount+1));
            System.out.println("Name : ");
            tempItem.setName(reader.readLine());
            System.out.println("Cost per day : ");
            tempItem.setCostPerDay(Double.parseDouble(reader.readLine()));
            System.out.println("Deposit : ");
            tempItem.setDeposit(Double.parseDouble(reader.readLine()));
            listItem.add(tempItem);
            System.out.println("Do you want to continue?(y/n)");
            ch = reader.readLine();
        }while(ch.equals("y"));

        System.out.println("Name \t\t\t Cost per Day \t\t\t Deposit");
        for (ItemType item : listItem){
            System.out.println(item);
        }
    }
}
