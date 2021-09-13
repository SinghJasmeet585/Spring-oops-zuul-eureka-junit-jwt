package org.example;

import java.util.ArrayList;

public class EmployeeDAO implements EmployeeInterface {

    ArrayList<Employee> employeeList = new ArrayList<>();

    @Override
    public void saveEmployeeDetails(Employee emp) {
        employeeList.add(emp);
    }

    @Override
    public ArrayList<Employee> getALlEmployeeDetails() {
        return employeeList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
}
