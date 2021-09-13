package com.niit.ibm;

public class Stall {
    protected String name;
    protected String detail;
    protected String ownerName;

    public Stall() {
    }

    public Stall(String name, String detail, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
    }

    public Double computeCost(String stallType, Integer squareFeet){
        if (stallType.equals("platinum")){
            return squareFeet*200d;
        }else if(stallType.equals("diamond")){
            return squareFeet*150d;
        }else if (stallType.equals("gold")){
            return squareFeet*100d;
        }
        return 0.0;
    }
    public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV){
        if (stallType.equals("platinum")){
            return squareFeet*200*10000d;
        }else if(stallType.equals("diamond")){
            return squareFeet*150*10000d;
        }else if (stallType.equals("gold")){
            return squareFeet*100*10000d;
        }
        return 0.0;
    }
}
