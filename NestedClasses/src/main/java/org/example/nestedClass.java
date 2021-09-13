package org.example;

class Super{
    int num1=20;
    int x=100;
    public void display(){
        System.out.println("super display");
    }
    public void show1(){
        System.out.println("super show");
    }
}
public class nestedClass extends Super {
    int num2=30;
    int x=200;

    public nestedClass(int num2) {
        this.num2 = num2;
    }

    public void display(){
        System.out.println("sub display");
    }
    public void show2(){
        System.out.println("sub show");
    }

    public static void main(String[] args) {
        Super obj = new nestedClass(10);
        System.out.println(obj.x);
        obj.num1=100;
        obj.display();
        obj.show1();
    }
}
