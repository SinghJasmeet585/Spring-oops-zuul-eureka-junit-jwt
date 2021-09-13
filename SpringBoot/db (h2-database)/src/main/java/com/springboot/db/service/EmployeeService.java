package com.springboot.db.service;

import com.springboot.db.repository.EmployeeRepository;
import com.springboot.db.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployeeDetails(Employee emp){
        employeeRepository.save(emp);
    }
}
