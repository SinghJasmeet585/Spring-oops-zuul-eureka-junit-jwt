package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //object of collection cannot be made
        //Collection<Integer> obj = new Collection<Integer>();

        //List<String> list = new List<String>() ;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10); //allows duplicate
        list.add(12);
        list.add(56); //allows null
        list.add(13);
        //stores in insertion order
        System.out.println(list);

        HashSet<Integer> hlist = new HashSet<>();
        hlist.add(10);
        hlist.add(10); //does not allow duplicate
        hlist.add(12);
        hlist.add(null); //allows null value
        hlist.add(13);

        System.out.println(hlist);

        int sumList = 0;
        for (Integer value : list) {
            if (value != null) {
                sumList += value;
            }
        }
        System.out.println(sumList);

        int sumSet = 0;
        for (Integer value : hlist) {
            if (value != null) {
                sumSet += value;
            }
        }
        System.out.println(sumSet);

        boolean flag=false;
        System.out.println("Enter number to be searched : ");
        Integer searchKey = Integer.parseInt(reader.readLine());
        for (Integer value: list){
            if (searchKey==value){
                flag=true;
            }
        }
        if(flag==true)
            System.out.println("Element found");
        else
            System.out.println("Not Found");

        Integer min=0;
        for (Integer value: list){
            if (value!=null && value<min){
                min=value;
            }
        }
        System.out.println(min);

        Integer max=0;
        for (Integer value: list){
            if (value!=null && value>max){
                max=value;
            }
        }
        System.out.println(max);

        // to check for datatypes
        //primitive data type not possible
        int v=10;
        //wrapper class is possible
        Integer y=10;
        System.out.println(y.getClass().getName());

        //Generic list
        ArrayList listGeneric = new ArrayList();
        listGeneric.add("Jasmeet");
        listGeneric.add(95.20);
        listGeneric.add(false);
        System.out.println(listGeneric);

        //sort
        Collections.sort(list);
        System.out.println(list);
    }
}
