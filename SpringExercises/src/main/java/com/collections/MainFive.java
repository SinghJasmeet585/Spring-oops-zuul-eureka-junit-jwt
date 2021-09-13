package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFive {
    public static void main(String[] args) {
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("applicationContextTwo.xml");
        ContactDetail contactDetail = applicationContext2.getBean("contactDetail2",ContactDetail.class);
        contactDetail.display();
    }
}
