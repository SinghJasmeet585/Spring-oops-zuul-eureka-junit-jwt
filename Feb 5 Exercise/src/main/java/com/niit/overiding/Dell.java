package com.niit.overiding;

public class Dell extends Laptop {
    String modelName;

    @Override
    public String specification(String name) {
        this.modelName=name;
        return brandName + " -- " + modelName;
    }
}
