package com.niit.project;

public class StallCategory {
    private String name;
    private String detail;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDetail(){
        return detail;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
    public StallCategory(){

    }
    public StallCategory(String name, String details){
        this.name=name;
        this.detail=details;
    }

    public void display(){
        System.out.println("Name:" + this.name);
        System.out.println("Details:" + this.detail);
    }
}

