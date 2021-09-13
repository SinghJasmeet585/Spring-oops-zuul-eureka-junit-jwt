package org.example;

import java.util.ArrayList;

public class Employee {

    String id;
    String name;

    //Has A;
    ArrayList<Address> addressesList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Address> getAddressesList() {
        return addressesList;
    }

    public void setAddressesList(ArrayList<Address> addressesList) {
        this.addressesList = addressesList;
    }
}
