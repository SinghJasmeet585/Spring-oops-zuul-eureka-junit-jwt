package com.niit.ibm;

public class Automobile {
    //instance variable
    private String name;
    private int cc;
    private String engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                ", engine='" + engine + '\'' +
                '}';
    }

    //instance method
    public String accelerate(){
        return "accelerate";
    }
    //static/class method
    static String musicPlayer(){
        return "MP3 Player";
    }
}
