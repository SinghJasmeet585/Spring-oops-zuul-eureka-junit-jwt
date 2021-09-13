package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(101, "Sathish");
        hmap.put(102, "Deepak");
        hmap.put(103, "Himang");
        hmap.put(104, "Aditya");
        hmap.put(null, "Ajay");
        hmap.put(105, null);

        hmap.put(101, "Vijay");

        Set<Map.Entry<Integer, String>> entries = hmap.entrySet();
        System.out.println(entries);
        System.out.println(hmap.entrySet());

        //Mao entry key-value pair
        for (Map.Entry<Integer, String> map :
                hmap.entrySet()) {
            //all operations are done here
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }

        Integer employeeID = Integer.parseInt(reader.readLine());
        for (Map.Entry<Integer, String> map :
                hmap.entrySet()) {
            if (employeeID.equals(map.getKey())){
                System.out.println(map.getValue());
            }
        }
    }
}

