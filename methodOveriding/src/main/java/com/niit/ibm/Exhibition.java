package com.niit.ibm;

public class Exhibition extends Event{
    protected int noOfStall;

    public Double projectedRevenue(){
        return noOfStall*10000d;
    }
}
