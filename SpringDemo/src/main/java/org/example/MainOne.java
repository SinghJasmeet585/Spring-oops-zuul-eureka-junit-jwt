package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainOne {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Singleton.xml");

        Sample sample1 = classPathXmlApplicationContext.getBean("sample",Sample.class);
        sample1.age=12;
        Sample sample2 = classPathXmlApplicationContext.getBean("sample",Sample.class);
        sample2.age=13;
        Sample sample3 = classPathXmlApplicationContext.getBean("sample",Sample.class);
        sample3.age=14;
        Sample sample4 = classPathXmlApplicationContext.getBean("sample",Sample.class);
        sample4.age=15;

        System.out.println(sample1.age);
        System.out.println(sample2.age);
        System.out.println(sample3.age);
        System.out.println(sample4.age);


        ClassPathXmlApplicationContext classPathXmlApplicationContext1 = new ClassPathXmlApplicationContext("spring.xml");
        Test test = classPathXmlApplicationContext1.getBean("test",Test.class);
        System.out.println(test.name);
        System.out.println(test.age);
        System.out.println(test.list);

    }
}
