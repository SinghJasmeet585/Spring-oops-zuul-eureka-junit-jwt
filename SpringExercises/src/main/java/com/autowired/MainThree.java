package com.autowired;

import org.example.TicketBooking;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainThree {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ContactDetail contactDetail = applicationContext.getBean("contactDetail",ContactDetail.class);
        contactDetail.display();
    }
}
