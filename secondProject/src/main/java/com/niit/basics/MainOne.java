package com.niit.basics;

import java.util.Scanner;

public class MainOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char c;
        do {

            System.out.println(" 1. 344 = 3^1 + 4^2 + 4^3");
            System.out.println(" 2. 344 = 3^3 + 4^2 + 4^1");
            System.out.println(" 3. Sum of Digits");
            System.out.println(" 4. Sum of odd and even digits");
            System.out.println(" 5. Prime Number");
            System.out.println(" 6. Sum of Prime Number");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.println(" 1. 344 = 3^1 + 4^2 + 4^3");
                    System.out.println("Enter the number = ");
                    int num1=scanner.nextInt();
                    int sum1=0;
                    int counter1=0;
                    int temp1=num1;
                    while(temp1!=0){
                        temp1=temp1/10;
                        counter1++;
                    }
                    while(num1!=0){
                        int temp=num1%10;
                        sum1+=Math.pow(temp,counter1);
                        counter1--;
                        num1=num1/10;
                    }
                    System.out.println("Sum of Digits = " + sum1);
                    break;


                case 2:
                    System.out.println(" 2. 344 = 3^3 + 4^2 + 4^1");
                    System.out.println("Enter the number = ");
                    int num2=scanner.nextInt();
                    int counter2=1;
                    int sum2=0;
                    while(num2!=0){
                        int temp2=num2%10;
                        sum2+=Math.pow(temp2,counter2);
                        counter2++;
                        num2=num2/10;
                    }
                    System.out.println("Sum of Digits = " + sum2);
                    break;


                case 3:
                    System.out.println(" 3. Sum of Digits");
                    System.out.println("Enter the number = ");
                    int num3=scanner.nextInt();
                    int sum3=0;
                    while(num3!=0){
                        int temp3=num3%10;
                        sum3+=temp3;
                        num3=num3/10;
                    }
                    System.out.println("Sum of Digits = " + sum3);
                    break;

                case 4:
                    System.out.println(" 4. Sum of odd and even digits");
                    System.out.println("Enter the number = ");
                    int num4=scanner.nextInt();
                    int sumOdd=0, sumEven=0;
                    while(num4!=0) {
                        int temp4 = num4 % 10;
                        if (temp4 % 2 == 0){
                            sumEven+=temp4;
                        }
                        else{
                            sumOdd+=temp4;
                        }
                        num4 = num4 / 10;
                    }
                    System.out.println("Sum of odd digits = " + sumOdd);
                    System.out.println("Sum of even digits = " + sumEven);
                    break;

                case 5:
                    System.out.println(" 5. Prime Number ");
                    System.out.println("Enter the number = ");
                    int num5=scanner.nextInt();
                    boolean flag5=false;
                    for(int i=2;i<=num5/2;i++){
                        if(num5 % i == 0){
                            flag5=true;
                        }
                    }
                    if(!flag5){
                        System.out.println(num5 + " is a prime number");
                    }else{
                        System.out.println(num5 + " is not a prime number");
                    }
                    break;

                case 6:
                    System.out.println(" 6. Sum of Prime Number");
                    System.out.println("Enter the number = ");
                    int num6=scanner.nextInt();
                    int sum6 = 0;
                    while(num6!=0){
                        int temp6=num6%10;
                        boolean flag6=false;
                        for(int i=2;i<=temp6/2;i++){
                            if(temp6 %i == 0){
                                flag6=true;
                                break;
                            }
                        }
                        if(!flag6 && temp6!=1){
                            sum6 +=temp6;
                        }
                        num6 =num6/10;
                    }
                    System.out.println("Sum of Prime Number = " + sum6);
                    break;


                default:
                    System.exit(0);
                    break;
                //    System.out.println("default");
            }
            System.out.println("To continue press y or n:");
            c = scanner.next().charAt(0);
        } while (c == 'y');

    }
}
