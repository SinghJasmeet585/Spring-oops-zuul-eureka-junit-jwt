package com.niit.model;

public class Student {
    //instance variables
    long rno;
    String name;
    int age;
    double percentage;
    boolean status;

    public Student(){
        this.rno=101;
        this.age=18;
        this.status=true;
        this.percentage=97.8;
        this.name="Vijay Deenanath chauhan";
    }

    public Student(long rno, String name, int age, double per, boolean st){
        this.rno=rno;
        this.age=age;
        this.status=st;
        this.percentage=per;
        this.name=name;
    }

    //instance methods
    public void displayStudentDetails(){
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.percentage);
        System.out.println(this.status);
    }

    public static void main(String[] args){
        Student student1=new Student();
        student1.displayStudentDetails();

        Student student2=new Student();
        student2.displayStudentDetails();

        Student student3=new Student(200,"tommy",33,45,true);
        student3.displayStudentDetails();

    }
}
