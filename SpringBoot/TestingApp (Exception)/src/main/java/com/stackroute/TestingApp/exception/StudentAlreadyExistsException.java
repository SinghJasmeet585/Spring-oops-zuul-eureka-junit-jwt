package com.stackroute.TestingApp.exception;
public class StudentAlreadyExistsException extends Exception {
    private String msg;
    public StudentAlreadyExistsException()
    {
    }
    public StudentAlreadyExistsException(String message,String msg){
        super(message);
        this.msg=msg;
    }
}