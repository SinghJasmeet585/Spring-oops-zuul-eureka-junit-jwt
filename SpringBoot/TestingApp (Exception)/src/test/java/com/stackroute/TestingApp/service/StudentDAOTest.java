package com.stackroute.TestingApp.service;

import com.stackroute.TestingApp.Repository.StudentRepository;
import com.stackroute.TestingApp.exception.StudentAlreadyExistsException;
import com.stackroute.TestingApp.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentDAOTest {

    @Mock // dummy interface for a class or an interface
    private StudentRepository repository;

    @InjectMocks
    private StudentServiceImp serviceImp;

    List<Student> studentList;

    @Test
    public void givenStudentToSaveShouldReturnSavedStudent() throws StudentAlreadyExistsException {
        Student student = new Student(1, "Sachin", "sac@gmail.com");
        when(repository.save(any())).thenReturn(student);
        serviceImp.saveStudent(student);
        verify(repository, times(1)).save(any());
    }

    @Test
    public void givenGetAllStudentShouldReturnAllStudent() {
        when(repository.findAll()).thenReturn(studentList);
        serviceImp.getAllStudent();
        verify(repository,times(1)).findAll();
    }

    @Test
    public void givenStudentIdToDeleteShouldReturnDeletedStudent(){
        Student student=new Student(1,"Sachin","sac@gmail.com");
      //  when(repository.findById(anyInt())).thenReturn(java.util.Optional.of(student));
       // serviceImp.saveStudent(student);
        serviceImp.deleteStudent(student.getId());
       // verify(repository,times(1)).findById(anyInt());
        verify(repository,times(1)).deleteById(anyInt());
    }

}