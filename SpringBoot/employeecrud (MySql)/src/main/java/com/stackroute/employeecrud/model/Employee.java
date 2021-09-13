package com.stackroute.employeecrud.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    //@GeneratedValue
    @Id
    @GeneratedValue
    private int empId;
    private String empName;
    private String post;
    private String email;

    public Employee() {
    }

    public Employee(int empId, String empName, String post, String email) {
        this.empId = empId;
        this.empName = empName;
        this.post = post;
        this.email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
