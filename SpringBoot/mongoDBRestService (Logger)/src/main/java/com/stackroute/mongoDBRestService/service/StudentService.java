package com.stackroute.mongoDBRestService.service;

import com.stackroute.mongoDBRestService.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudent();
    void deleteStudent(int id);
    Student updateStudent(Student student);
    Student findByStdId(int id);
    Student findByStdEmail(String email);
}
