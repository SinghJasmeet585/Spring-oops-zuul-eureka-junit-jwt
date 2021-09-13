package com.niit.ibm;

public class EmployeeMain {
    public static void main(String[] args) {
        String message="Welcome to java program";
        String detail="101,Sathish,9566259956,10000";
        String detail2="102,Jasmeet,9891982212,10000";


        String[] split=message.split(" ");
        for (int i=0; i< split.length; i++) {
            System.out.println("index " + i + "-->" + split[i]);
        }
        for(String values : split){
            System.out.println(values.toUpperCase());
        }

        System.out.println();

        String[] employeedetail=detail.split(",");
        Employee employee=new Employee();
        for (int i=0; i< employeedetail.length; i++) {
            System.out.println("index " + i + "-->" + employeedetail[i]);
        }
        for(String values : employeedetail){
            System.out.println(values);
        }
        employee.setId(Integer.parseInt(employeedetail[0]));
        employee.setName(employeedetail[1]);
        employee.setMobile(Long.parseLong(employeedetail[2]));
        employee.setSalary(Double.parseDouble(employeedetail[3]));

        System.out.println("Employee Detail - 1");
        System.out.println(employee);


        String[] employeedetail2=detail2.split(",");
        Employee employee2=new Employee();
        for (int i=0; i< employeedetail2.length; i++) {
            System.out.println("index " + i + "-->" + employeedetail2[i]);
        }
        for(String values : employeedetail2){
            System.out.println(values);
        }
        employee2.setId(Integer.parseInt(employeedetail2[0]));
        employee2.setName(employeedetail2[1]);
        employee2.setMobile(Long.parseLong(employeedetail2[2]));
        employee2.setSalary(Double.parseDouble(employeedetail2[3]));

        System.out.println("Employee Detail - 2");
        System.out.println(employee2);


    }
}
