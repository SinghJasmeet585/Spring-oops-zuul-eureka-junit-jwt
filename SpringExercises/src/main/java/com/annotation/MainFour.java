package com.annotation;

import org.example.TicketBooking;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFour {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hall hall = applicationContext.getBean("hall", Hall.class);
        System.out.println("This hall of length " + hall.length + " and width " + hall.width + " is owned by " + hall.getOwner().name);
    }
}
