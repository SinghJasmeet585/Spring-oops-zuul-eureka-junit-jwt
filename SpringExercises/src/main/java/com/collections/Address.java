package com.collections;

public class Address {
    String line1;
    String city;
    String pincode;

    public void display(){
        System.out.println(line1);
        System.out.println(city);
        System.out.println(pincode);
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
