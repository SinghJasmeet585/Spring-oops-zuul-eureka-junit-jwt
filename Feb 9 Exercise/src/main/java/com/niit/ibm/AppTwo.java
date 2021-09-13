package com.niit.ibm;

import java.util.ArrayList;
import java.util.Iterator;

public class AppTwo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("chennai");
        list.add("goa");
        list.add("delhi");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("goa")){
                iterator.remove();
            }
        }
        System.out.println(list);

        //Concurrent Modification Exception
        for (String str:
             list) {
            if(str.equals("delhi")){
                list.remove("delhi"); //Error
            }
        }
        System.out.println(list);
    }
}
