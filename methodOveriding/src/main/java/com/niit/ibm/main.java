package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name of the event = ");
        String name = reader.readLine();
        System.out.println("Enter detail of the event = ");
        String detail = reader.readLine();
        System.out.println("Enter owner name of the event = ");
        String ownerName = reader.readLine();

        Event eve = new Event();
        eve.name=name;
        eve.detail=detail;
        eve.ownerName=ownerName;

        System.out.println("Enter the type of the event:\n" +
                "1.Exhibition\n" +
                "2.StageEvent\n");
        int ch = Integer.parseInt(reader.readLine());
        if(ch==1){
            System.out.println("1.Exhibition");
            Exhibition exh = new Exhibition();
            System.out.println("Enter the number of stalls:");
            exh.noOfStall= Integer.parseInt(reader.readLine());
            System.out.println("The projected revenue of the event is = " + exh.projectedRevenue());
        }else if(ch==2){
            System.out.println("2.StageEvent");
            StageEvent stg=new StageEvent();
            System.out.println("Enter the number of shows:");
            stg.noOfShows= Integer.parseInt(reader.readLine());
            System.out.println("Enter the number seats per show:");
            stg.noOfSeatsPerShow= Integer.parseInt(reader.readLine());
            System.out.println("The projected revenue of the event is = " + stg.projectedRevenue());
        }else{
            System.out.println("Enter valid response");
        }

    }
}
