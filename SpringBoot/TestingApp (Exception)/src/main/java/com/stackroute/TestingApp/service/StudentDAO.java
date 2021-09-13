package com.stackroute.TestingApp.service;

import com.stackroute.TestingApp.exception.StudentAlreadyExistsException;
import com.stackroute.TestingApp.model.Student;

import java.util.List;

public interface StudentDAO {
    Student saveStudent(Student student) throws StudentAlreadyExistsException;
    List<Student> getAllStudent();
    void deleteStudent(int id);
}
