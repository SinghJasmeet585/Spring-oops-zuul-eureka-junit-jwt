package org.example;

class Parent{
    int age=55;
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

public class main extends Parent{
    int age=25;

    public main() {
     //   super();
        System.out.println("Child constructor");
    }
    public void display(int age){
        System.out.println("Age child = " + this.age);
        System.out.println("Parent age = " + super.age);

        System.out.println(age);
        int age1 = age + 10;
        System.out.println(age);
        System.out.println(age1);
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        main main= new main();
        main.display(10);
    }
}
