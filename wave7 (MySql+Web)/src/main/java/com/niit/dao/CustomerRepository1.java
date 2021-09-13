package com.niit.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerRepository1 {
    public String getDaoMessage(){
        return "message from DAO Class";
    }
}
