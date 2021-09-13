package com.stackroute.TestingApp.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    @BeforeEach
    void setUp(){
        student=new Student();
    }

    @Test
    public void shouldGetStudentName(){
        student.setStudentName("Sachin");
        assertEquals("Sachin",student.getStudentName());
    }

    @Test
    public void shouldGetStudentEmail(){
        student.setStudentEmail("sac@gmail.com");
        assertEquals("sac@gmail.com",student.getStudentEmail());
    }

    @Test void shouldGetStudentId(){
        student.setId(1);
        assertEquals(1,student.getId());
    }

}