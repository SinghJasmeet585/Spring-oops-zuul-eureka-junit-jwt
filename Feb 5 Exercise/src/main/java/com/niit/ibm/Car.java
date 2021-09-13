package com.niit.ibm;

public class Car extends Automobile{
    private String modelName;
    private double price;
    private int mileage;

    void display(){
        System.out.println("Comapny name=" + getName());
        System.out.println(", cc=" + getCc());
        System.out.println(", engine=" + getEngine());
        System.out.println("modelName='" + modelName);
        System.out.println(", price=" + price);
        System.out.println(", mileage=" + mileage);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String specification(){
        return "Mileage 30km/lt";
    }
}
