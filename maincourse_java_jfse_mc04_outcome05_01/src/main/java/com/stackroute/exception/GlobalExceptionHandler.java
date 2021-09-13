package com.stackroute.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Value(value = "Blog Already Exists")
    private String message;
    @ExceptionHandler(value = BlogAlreadyExistsException.class)
    public ResponseEntity<String> blogAlreadyExists(BlogAlreadyExistsException exception){
        return new ResponseEntity<String>("Blog Already Exists", HttpStatus.CONFLICT);
    }

    @Value(value = "Blog Not Found")
    @ExceptionHandler(value = BlogNotFoundException.class)
    public ResponseEntity<String> blogNotFound(BlogNotFoundException exception){
        return new ResponseEntity<String>("Blog Not Found", HttpStatus.NOT_FOUND);
    }

}
