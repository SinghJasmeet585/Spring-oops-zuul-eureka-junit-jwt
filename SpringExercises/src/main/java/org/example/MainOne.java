package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainOne {
    public static void main(String[] args) {
        //TicketBooking ticketBooking = new TicketBooking();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TicketBooking ticketBooking = applicationContext.getBean("ticketBooking", TicketBooking.class);
        System.out.println("The total cost for 3 persons is Rs." + ticketBooking.fareGenerator());
    }
}
