package com.niiit.ibm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Account {
    String accountNumber;
    String accountName;
    Double dueAmount;

    public Account(String accountNumber, String accountName, Double dueAmount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.dueAmount = dueAmount;
    }

    public void validate(String dueDate, Double unpaidAmount, Double amount) {
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate anyDate=LocalDate.parse(dueDate,dateTimeFormatter);
        long between = ChronoUnit.DAYS.between(anyDate, LocalDate.now());
        try {
            if (unpaidAmount > 2000 || between > 45) {
                throw new Exception("Further Transactions Not Possible until clearance of bill");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void display(){
        System.out.println("Account Details : ");
        System.out.println(this.accountName);
        System.out.println(this.accountNumber);
        System.out.println(this.dueAmount);
    }
}
