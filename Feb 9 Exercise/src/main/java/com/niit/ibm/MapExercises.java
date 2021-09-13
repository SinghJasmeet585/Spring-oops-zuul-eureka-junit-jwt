package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter total number of students : ");
        int number = Integer.parseInt(reader.readLine());
        while (number-- != 0) {
            System.out.println("Enter roll number");
            int rno = Integer.parseInt(reader.readLine());
            if (rno % 2 == 0) {
                System.out.println("Enter Marks : ");
                int marks = Integer.parseInt(reader.readLine());
                map.put(rno, marks);
            }else{
                System.out.println("Roll Number is odd, Marks not required");
            }
        }

        System.out.println("\t\t\t Roll Number \t\t\t Marks");
        for (Map.Entry<Integer,Integer> entry:
             map.entrySet()) {
            System.out.println(String.format("%20s %20s",entry.getKey(),entry.getValue()));
        }
    }
}
