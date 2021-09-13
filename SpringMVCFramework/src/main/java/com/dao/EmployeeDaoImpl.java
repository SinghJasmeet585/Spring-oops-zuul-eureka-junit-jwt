package com.dao;

import com.model.Employee;

import java.util.ArrayList;

public class EmployeeDaoImpl implements EmployeeDao {
    static ArrayList<Employee> arrayList = new ArrayList<>();

    @Override
    public Boolean addEmployeeDetails(Employee employee) {
        boolean add = arrayList.add(employee);
        if (add) {
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Employee> getEmployeeDetails() {
        return arrayList;
    }

    public void delete(int counter){
        arrayList.remove(counter);
    }

    public void update(int counter){

    }

}
