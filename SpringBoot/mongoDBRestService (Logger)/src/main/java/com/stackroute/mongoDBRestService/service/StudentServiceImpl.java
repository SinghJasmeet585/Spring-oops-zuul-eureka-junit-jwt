package com.stackroute.mongoDBRestService.service;

import com.stackroute.mongoDBRestService.model.Student;
import com.stackroute.mongoDBRestService.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Override
    public Student addStudent(Student student) {
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

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByStdId(int id) {
        return repository.findById(id);
    }

    @Override
    public Student findByStdEmail(String email) {
        return findByStdEmail(email);
    }
}
