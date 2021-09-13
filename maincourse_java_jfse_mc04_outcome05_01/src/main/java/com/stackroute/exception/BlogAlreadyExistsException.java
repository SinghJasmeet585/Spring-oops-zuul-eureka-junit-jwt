package com.stackroute.exception;

public class BlogAlreadyExistsException extends Exception{
    public String message;

    public BlogAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }

    public BlogAlreadyExistsException() {
    }
}
