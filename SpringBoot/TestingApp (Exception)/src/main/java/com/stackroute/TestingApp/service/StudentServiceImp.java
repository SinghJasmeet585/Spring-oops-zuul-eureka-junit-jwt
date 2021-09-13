package com.stackroute.TestingApp.service;

import com.stackroute.TestingApp.Repository.StudentRepository;
import com.stackroute.TestingApp.exception.StudentAlreadyExistsException;
import com.stackroute.TestingApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentDAO{

    @Autowired
    StudentRepository repository;

    @Override
    public Student saveStudent(Student student) throws StudentAlreadyExistsException {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return repository.findAll();
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
}
