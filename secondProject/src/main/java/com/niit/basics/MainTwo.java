package com.niit.basics;

import java.util.Scanner;

public class MainTwo {


    public  static void main(String[] args) {

        // Switch case
        Scanner scanner=new Scanner(System.in);
        char c;
        do {

            System.out.println(" 1. Factorial");
            System.out.println(" 2. Fibonacci");
            System.out.println(" 3. Armstrong");
            System.out.println(" 4. Palindrome");
            System.out.println(" 5. Swapping of two numbers");
            System.out.println(" 6. Greatest of three numbers");
            System.out.println("Enter your choice:");

            int choice=scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Factorial");
                    System.out.println("Enter the number = ");
                    int num1=scanner.nextInt();
                    int fact=1;
                    for(int i=1;i<=num1;i++){
                        fact=fact*i;
                    }
                    System.out.println("Factorial=" + fact);
                    break;

                case 2:
                    System.out.println("Fibonacci");
                    System.out.println("Enter the number =");
                    int num2=scanner.nextInt();
                    int x=0,y=1,z;
                    System.out.print(x + " " + y);
                    for(int i=2;i<num2;i++){
                        z=x+y;
                        System.out.print(" " + z);
                        x=y;
                        y=z;
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Armstrong");
                    System.out.println("Enter the number =");
                    int num3=scanner.nextInt();
                    int original=num3, sum3=0;
                    while(num3!=0){
                        int temp3 = num3 % 10;
                        sum3+=Math.pow(temp3,3);
                        num3=num3/10;
                    }
                    if(sum3==original) System.out.println(original + " is an Armstrong number.");
                    else System.out.println(original + " is NOT an Armstrong number.");
                    break;

                case 4:
                    System.out.println("Palindrome");
                    System.out.println("Enter the number =");
                    int num4=scanner.nextInt();
                    int rev=0;
                    int original4=num4;
                    while(num4 != 0){
                        int temp = num4 % 10;
                        rev = rev*10 + temp;
                        num4 = num4 / 10;
                    }
                    if(rev == original4) System.out.println(rev + " is a Palindrome");
                    else System.out.println(original4 + " is NOT a Palindrome");
                    break;

                case 5:
                    System.out.println("Swapping of two numbers");
                    System.out.println("Enter first number =");
                    int num_one=scanner.nextInt();
                    System.out.println("Enter second number =");
                    int num_two=scanner.nextInt();

                    num_one=num_one+num_two;
                    num_two=num_one-num_two;
                    num_one=num_one-num_two;
                    System.out.println("Swapping is done: " + num_one + " " + num_two);
                    break;

                case 6:
                    System.out.println("Greatest of three numbers");
                    System.out.println("Enter first number =");
                    int num_first=scanner.nextInt();
                    System.out.println("Enter second number =");
                    int num_second=scanner.nextInt();
                    System.out.println("Enter third number =");
                    int num_three=scanner.nextInt();

                    if (num_first > num_second) {
                        if (num_first > num_three) {
                            System.out.println(num_first + " is the greatest number");
                        } else {
                            System.out.println(num_three + " is the greatest number");
                        }
                    } else {
                        if (num_second > num_three) {
                            System.out.println(num_second + " is the greatest number");
                        } else {
                            System.out.println(num_three + " is the greatest number");
                        }
                    }
                    break;

                default:
                    System.exit(0);
                    break;
                //    System.out.println("default");
            }
            System.out.println("To continue press y or n:");
            c=scanner.next().charAt(0);
        }while(c == 'y');


    }
}
