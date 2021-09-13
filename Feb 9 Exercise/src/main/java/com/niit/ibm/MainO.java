package com.niit.ibm;

class Parent{
    void message(){
        System.out.println("Parent message");
    }
}

class Child extends Parent{
    void message(){
        System.out.println("Child message");
    }
}
public class MainO {
    public static void main(String[] args) {

        //Upcasting
        Parent ref1= new Child();
        ref1.message();

        //Parent cannot be cast to Child
        //Child ref2 = (Child) new Parent();  //Error
        //ref2.message();


        //Downcasting
        Child ref3 = (Child) ref1;
        ref3.message();



        long num1= 956166287;
        int num2 = (int) num1;
        short num3 = (short)num2;
        byte num4 = (byte)num3;
        System.out.println(num1+" "+num2+" "+num3+" "+num4);
    }
}
