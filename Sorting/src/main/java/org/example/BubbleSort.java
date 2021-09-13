package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("number of elements : ");
        int number=Integer.parseInt(reader.readLine());
        int[] array = new int[number];
        System.out.println("enter elements");
        for (int i=0;i<number;i++){
            array[i]=Integer.parseInt(reader.readLine());
        }

        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length-1;j++){
                if(array[j] > array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted array : ");
        for (Integer value:
             array) {
            System.out.println(value);
        }
    }
}
