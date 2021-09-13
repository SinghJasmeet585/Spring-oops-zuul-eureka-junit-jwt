package com.autowired;

public class ContactDetail {
    String mobileNumber;
    String email;
    Address address;

    public void display(){
        System.out.println(mobileNumber);
        System.out.println(email);
        address.display();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
