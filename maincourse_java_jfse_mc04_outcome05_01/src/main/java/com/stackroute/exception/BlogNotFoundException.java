package com.stackroute.exception;

public class BlogNotFoundException extends Exception{
    private String message;

    public BlogNotFoundException() {
    }

    public BlogNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
