package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ValidationMain {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //email validation
        String emailId = "";
       // if(emailId.matches())

        //password validation
        String password = "JasM@@7687hs";
        if(password.matches(".{6,20}")) {
            if (password.matches(".*[0-9].*+")) {
                if (password.matches(".*[a-z].*+")) {
                    if (password.matches(".*[A-Z].*+")) {
                        if (password.matches(".*[@#$%]{1}.*")) {
                            System.out.println("password is valid");
                        }else{
                            System.out.println("Invalid");
                        }
                    }else{
                        System.out.println("Invalid");
                    }
                }else{
                    System.out.println("Invalid");
                }
            }else
                System.out.println("Invalid");
        }else
            System.out.println("Invalid");


        //ID validation
        String ID = "IBM-AAA-123";
        if(ID.matches("IBM-.*[A-Z]{3}.*-.*[0-9].*")){
            System.out.println("ID is valid");
        }else
            System.out.println("ID is not valid");


        //Phone number validation
        String phone = "9871396749";
        if(phone.matches("[987]{1}[0-9]{9}")){
            System.out.println("Phone is valid");
        }else{
            System.out.println("Phone is not valid");
        }
    }

}
