package org.example;

/**
 * Hello world!
 */
public class App {
    static String name;
    int age;

    static {
        name = "Jasmeet Singh";
        System.out.println("1 Static Block");
    }

    static void message() {
        System.out.println("3 Static Method : " + name);
    }

    void message1() {
        System.out.println("4 Instance method " + name);
    }

    public App() {
        System.out.println("2 Constructor");
    }

    public static void main(String[] args) {
        new App();
        App.message();
        System.out.println("Static variable print -> " + App.name);
        new App().message1();
    }
}
