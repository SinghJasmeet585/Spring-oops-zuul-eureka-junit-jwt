package com.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainOne {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        Car car = classPathXmlApplicationContext.getBean("car", Car.class);
        System.out.println(car.getEngine().getEngineType());
        System.out.println(car.getCarName());
    }
}
