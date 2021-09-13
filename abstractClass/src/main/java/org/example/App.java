package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("List of Shapes:\n" +
                "1.Circle\n" +
                "2.Rectangle\n" +
                "3.Square\n" +
                "Enter your choice:\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ch = reader.readLine();
        if (ch.equals("1")) {
            System.out.println("Enter the radius of the Circle: ");
            float radius = Float.parseFloat(reader.readLine());
            Circle circle = new Circle(radius);
            System.out.println("The perimeter is : " + circle.calculatePerimeter());
        } else if (ch.equals("2")) {
            System.out.println("Enter the length of the Rectangle: ");
            float length = Float.parseFloat(reader.readLine());
            System.out.println("Enter the breadth of the Circle: ");
            float breadth = Float.parseFloat(reader.readLine());
            Rectangle rectangle = new Rectangle(length, breadth);
            System.out.println("The perimeter is : " + rectangle.calculatePerimeter());
        } else if (ch.equals("3")) {
            System.out.println("Enter the side of the square = ");
            float side = Float.parseFloat(reader.readLine());
            Square square = new Square(side);
            System.out.println("The perimeter is : " + square.calculatePerimeter());
        } else
            System.out.println("Invalid choice");
    }
}
