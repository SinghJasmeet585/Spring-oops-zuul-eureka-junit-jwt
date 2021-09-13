package com.stackroute.mongoDBRestService.controller;

import com.stackroute.mongoDBRestService.model.Student;
import com.stackroute.mongoDBRestService.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class StudentController {

   // private final static Logger log = (Logger) LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentService service;

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        log.info("This is inside add student");
        return new ResponseEntity<Student>(service.addStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @PutMapping("/student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(service.updateStudent(student),HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable int id){
        service.deleteStudent(id);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id){
        return new ResponseEntity<Student>(service.findByStdId(id),HttpStatus.OK);
    }

    @GetMapping("/student/{email}")
    public Student getStudentByEmail(@PathVariable String email){
        return service.findByStdEmail(email);
    }

}
