package com.stackroute.TestingApp.controller;

import com.stackroute.TestingApp.exception.StudentAlreadyExistsException;
import com.stackroute.TestingApp.model.Student;
import com.stackroute.TestingApp.service.StudentDAO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentDAO dao;

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) throws StudentAlreadyExistsException {
        return new ResponseEntity<Student>(dao.saveStudent(student), HttpStatus.OK);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return dao.getAllStudent();
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable int id){
        dao.deleteStudent(id);
    }

    @ExceptionHandler(value = StudentAlreadyExistsException.class)
    public ResponseEntity<String> studentAlreadyexist(StudentAlreadyExistsException exception)
    {
        return new ResponseEntity<String>("Student Id Already Exists",HttpStatus.CONFLICT);
    }

}
