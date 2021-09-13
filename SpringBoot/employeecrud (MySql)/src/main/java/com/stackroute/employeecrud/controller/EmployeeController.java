package com.stackroute.employeecrud.controller;

import com.stackroute.employeecrud.model.Employee;
import com.stackroute.employeecrud.service.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeDAO.getAllEmployee();
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeDAO.addEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeDAO.updateEmployee(employee),HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeDAO.deleteEmployee(id);
    }

}
