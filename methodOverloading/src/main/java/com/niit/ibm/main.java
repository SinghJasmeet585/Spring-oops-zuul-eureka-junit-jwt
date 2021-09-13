package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name of the stall = ");
        String name = reader.readLine();
        System.out.println("Enter detail of the stall= ");
        String detail = reader.readLine();
        System.out.println("Enter owner name of the stall = ");
        String ownerName = reader.readLine();

        Stall st = new Stall();
        st.name=name;
        st.detail=detail;
        st.ownerName=ownerName;

        System.out.println("Enter the type of stall = ");
        String typeStall = reader.readLine();

        System.out.println("Enter the size of stall = ");
        int squareFeet = Integer.parseInt(reader.readLine());

        System.out.println("Does the stall have TV (y / n) = ");
        String ch = reader.readLine();
        Double cost;
        if(ch.equals("y")){
            System.out.println("Enter the number of TV = ");
            int noOfTV = Integer.parseInt(reader.readLine());
            cost = st.computeCost(typeStall,squareFeet,noOfTV);
        }else{
            cost = st.computeCost(typeStall,squareFeet);
        }

        System.out.println("The cost of the stall = " + cost);
    }
}
