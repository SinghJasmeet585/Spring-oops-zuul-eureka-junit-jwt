package com.niit.ibm.set;

import com.niit.ibm.list.ItemType;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ch;
        //int nameCount=0;
        HashSet<String> setName = new HashSet<>();
        do{
            System.out.println("Enter the username : ");
            String name =reader.readLine();
            setName.add(name);
            System.out.println("Do you want to continue?(y/n)");
            ch = reader.readLine();
        }while(ch.equals("y"));

        System.out.println("The unique number of usernames is " + setName.size());
    }
}
