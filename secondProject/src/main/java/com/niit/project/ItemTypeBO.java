package com.niit.project;

public class ItemTypeBO {

    public Double calculateCost(ItemType typeIns, int noOfDay){
        Double totalCost= noOfDay * typeIns.getCostPerDay();
        return totalCost;
    }
}
