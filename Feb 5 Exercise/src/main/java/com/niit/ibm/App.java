package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App extends Car
{
    public static void main( String[] args ) throws IOException {
        Polymorphism polymorphism = new Polymorphism();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name = ");
        String name=reader.readLine();
        System.out.println("Number of contacts to save = ");
        int noOfContacts=Integer.parseInt(reader.readLine());
        if(noOfContacts == 1){
            System.out.println("Enter single contact= ");
            String s = polymorphism.saveContact(name,reader.readLine());
            System.out.println(s);
        }else if(noOfContacts==2){
            System.out.println("Enter two contact= ");
            String s = polymorphism.saveContact(name,reader.readLine(), reader.readLine());
            System.out.println(s);
        }else{
            System.out.println("Enter valid option");
        }

        System.out.println(polymorphism.saveContact("Jasmeet", 1534516265l));
        System.out.println(polymorphism.saveContact(name,Long.parseLong(reader.readLine())));


        /*
        Car car = new Car();
        car.setModelName("Baleno");
        car.setMileage(22);
        car.setPrice(25000);
        car.setName("Maruti");
        car.setCc(220);
        car.setEngine("engine1");

        car.display();

        System.out.println(car.accelerate());
        System.out.println(car.musicPlayer());
        System.out.println(car.specification());
        //subclass inherit all properties from super class.

        Automobile auto=new Automobile();
        auto.setCc(110);
        auto.setEngine("engine2");
        auto.setName("Tata");
        System.out.println(auto);

        App app = new App();
        System.out.println("Automobile ---");
        app.setModelName("Baleno");
        app.setMileage(22);
        app.setPrice(25000);
        app.setName("Maruti");
        app.setCc(220);
        app.setEngine("engine1");
        app.display();

         */
    }

}
