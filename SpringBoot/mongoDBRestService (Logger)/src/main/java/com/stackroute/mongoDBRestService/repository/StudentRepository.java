package com.stackroute.mongoDBRestService.repository;

import com.stackroute.mongoDBRestService.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {
    Student findById(int id);
    Student findByStdEmail(String email);
}
