package com.dao;

import com.model.Employee;

import java.util.ArrayList;

public interface EmployeeDao {
    Boolean addEmployeeDetails(Employee employee);

    ArrayList<Employee> getEmployeeDetails();
}
