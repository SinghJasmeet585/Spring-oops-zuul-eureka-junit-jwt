package com.springboot.db.controller;

import com.springboot.db.model.Employee;
import com.springboot.db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //Web Service
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployeeDetails(employee);
        return "Employee Saved Successfully";
    }

}
