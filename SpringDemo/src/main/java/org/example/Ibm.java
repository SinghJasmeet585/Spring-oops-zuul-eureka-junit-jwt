package org.example;

public class Ibm {
    String location;
    String product;

    public Ibm() {
    }

    public Ibm(String location, String product) {
        this.location = location;
        this.product = product;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
