package com.niit.project;

public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int pincode;

    public Address(){

    }
    public Address(String addressLine1, String addressLine2, String city,String state, int pincode ){
        this.addressLine1=addressLine1;
        this.addressLine2=addressLine2;
        this.state=state;
        this.city=city;
        this.pincode=pincode;
    }
    public void display(){
        System.out.println("Address Line 1:"+this.addressLine1);
        System.out.println("Address Line 2:"+this.addressLine2);
        System.out.println("State:"+this.state);
        System.out.println("City:"+this.city);
        System.out.println("Pincode:"+this.pincode);
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }


    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPincode() {
        return pincode;
    }
}
