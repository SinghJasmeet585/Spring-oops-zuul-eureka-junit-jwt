package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User userOne = new User();
        System.out.println("Enter Details");
        userOne.setName(reader.readLine());
        userOne.setMobile(reader.readLine());
        userOne.setUsername(reader.readLine());
        userOne.setPassword(reader.readLine());

        UserBO userOnePass = new UserBO();
        userOnePass.validate(userOne);
    }
}
