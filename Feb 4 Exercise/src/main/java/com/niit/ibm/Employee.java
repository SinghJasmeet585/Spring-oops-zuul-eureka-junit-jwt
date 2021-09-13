package com.niit.ibm;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private long mobile;

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public long getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", mobile=" + mobile +
                '}';
    }
}
