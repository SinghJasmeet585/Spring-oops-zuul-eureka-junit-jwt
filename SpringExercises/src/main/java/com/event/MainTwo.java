package com.event;

import org.example.TicketBooking;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTwo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Event event1=applicationContext.getBean("event1",Event.class);
        Event event2=applicationContext.getBean("event2",Event.class);
        Event event3=applicationContext.getBean("event3",Event.class);
        event1.display();
        event2.display();
        event3.display();
    }
}
