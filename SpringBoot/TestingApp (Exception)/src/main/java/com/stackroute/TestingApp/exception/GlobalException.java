package com.stackroute.TestingApp.exception;
import com.stackroute.TestingApp.exception.StudentAlreadyExistsException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalException {
    @Value(value="${data.exception.message}")
    private String message;
    @ExceptionHandler(value = StudentAlreadyExistsException.class)
    public ResponseEntity<String> studentAlreadyexit(StudentAlreadyExistsException exception)
    {
        return new ResponseEntity<String>("Student Id Already Exists", HttpStatus.CONFLICT);
    }
}
