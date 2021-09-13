package com.niiit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the transaction details:");
        System.out.println("Enter the account number = ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String accountNumber= reader.readLine();
        System.out.println("Enter the account holder name = ");
        String accountName = reader.readLine();
        System.out.println("Last due date : ");
        String dueDate= reader.readLine();
        System.out.println("Unpaid amount ");
        Double dueAmount=Double.parseDouble(reader.readLine());
        System.out.println("Transaction amount");
        Double amount=Double.parseDouble(reader.readLine());

        Account account=new Account(accountNumber,accountName,dueAmount);
        account.validate(dueDate,dueAmount,amount);
        account.display();
    }
}
