package org.example;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.jar.JarOutputStream;

/**
 * Hello world!
 */
public class App {


    String message;

    List<String> list;
    HashMap<Integer,String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        //Ibm ibm = new Ibm();
        //One class is dependent on other class
        //tightly coupled

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // Bean for Ibm class
        //Ibm ibm = (Ibm) applicationContext.getBean("ibm"); //also applicable
        Ibm ibm = applicationContext.getBean("ibm",Ibm.class);
        // Bean for App class
        App app = applicationContext.getBean("app", App.class);

        System.out.println(app.getMessage());
        System.out.println(app.getList());
        System.out.println(ibm.getLocation());
        System.out.println(ibm.getProduct());

        Sample sample=applicationContext.getBean("sample",Sample.class);
        sample.age=18;

        Sample sample1=applicationContext.getBean("sample",Sample.class);
        sample1.age=50;

        System.out.println(sample.age);
        System.out.println(sample1.age);


    }
}
