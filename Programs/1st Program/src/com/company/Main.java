package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2,sum;
        System.out.println("Enter a number");
        Scanner n1 =new Scanner(System.in);
        num1=n1.nextInt();
        System.out.println("Enter the second number");
        Scanner n2=new Scanner(System.in);
        num2=n2.nextInt();
        sum=num1+num2;
        System.out.println("Sum of two numbers is "+sum);
    }
}
