package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float num1,num2,ans = 0;
	char operator;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the First Number");
        num1=input.nextFloat();
        System.out.println("Enter the Second Number");
        num2=input.nextFloat();
        System.out.println("Enter one of the Operator (+,_,*,/)");
        operator=(input.next()).charAt(0);
        
        if (operator=='+')
            ans=num1+num2;
        else if (operator=='-')
            ans=num1-num2;
        else if (operator=='*')
            ans=num1*num2;
        else if (operator=='/')
            ans=num1/num2;
        
        System.out.println("The answer is ="+ans);
    }
    
}
