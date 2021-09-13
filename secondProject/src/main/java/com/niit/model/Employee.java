package com.niit.model;


public class Employee {
    int employeeID;
    String employeeName;
    static String companyName = "IBM";

    public Employee(){

    }
    public Employee(int id, String name){
        this.employeeName=name;
        this.employeeID=id;
    }
    public static void main(String[] args) {
        int age = 18;
        System.out.println(age);

        Employee employeeone = new Employee();
        employeeone.employeeID = 100;
        employeeone.employeeName = "Jasmeet";

        System.out.println(employeeone.employeeID);
        System.out.println(employeeone.employeeName);
        System.out.println(Employee.companyName);

        Employee employeetwo = new Employee();
        employeetwo.employeeID = 200;
        employeetwo.employeeName = "Deepak";
        Employee.companyName = "NIIT";

        System.out.println(employeetwo.employeeID);
        System.out.println(employeetwo.employeeName);
        System.out.println(Employee.companyName);

        Employee employeethree=new Employee(300,"Sathish");
        System.out.println(employeethree.employeeID);
        System.out.println(employeethree.employeeName);
        System.out.println(Employee.companyName);
    }
}
