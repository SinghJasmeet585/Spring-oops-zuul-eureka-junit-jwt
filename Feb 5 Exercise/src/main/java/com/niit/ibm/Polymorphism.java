package com.niit.ibm;

public class Polymorphism {
    public String name;
    public String airtel;
    public String jio;

    //method overloading
    public String saveContact(String name, String contact1){
        return name + ", your contact " + contact1 + " is saved with one number";
    }

    public String saveContact(String name, String contact1, String contact2){
        return name + ", your contact " + contact1 + " and " + contact2 +  " is saved with two number";
    }

    public String saveContact(String name, Long contact1){
        return name + ", your contact " + contact1 + " is saved with long number";
    }
}
