package com.stackroute.TestingApp.Repository;

import com.stackroute.TestingApp.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository repository;

    @Test
    public void givenSaveStudentShouldReturnSaveStudent(){
        Student student = new Student(1,"Sachin","sac@gmail.com");
        repository.save(student);
        Student student1 = repository.findById(student.getId()).get();
        assertNotNull(student1);
        assertEquals(student.getStudentName(),student1.getStudentName());
    }

    @Test
    public void shouldReturnListOfStudent(){
        Student student=new Student(1,"sac","sac@gm.cm");
        Student student1=new Student(2,"jas","jas@gm.com");
        Student student2 = new Student(3,"dep","dep@gm.com");
        repository.save(student);
        repository.save(student1);
        repository.save(student2);
        List<Student> studentList=repository.findAll();
        assertEquals("jas",studentList.get(1).getStudentName());
    }

}