package com.collections;

import java.util.List;

public class ContactDetail {
    Address address;
    String email;
    List<String> contactNumbers;

    public void display(){
        System.out.println(email);
        System.out.println(contactNumbers);
        address.display();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(List<String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }
}
