package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Andile's Calculator");

        Calculator add = new Calculator();

        System.out.println("The answer for Add is: " + add.add(1,2));
        System.out.println("The answer subtract is: " + add.subtract(1,2));
        System.out.println("The answer multiply is: " + add.multiply(1,2));
        System.out.println("The answer division is: " + add.division(9,3));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to Add: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number to Add: ");
        int num2 = sc.nextInt();

        System.out.println("The answer for Add is: " + add.add(num1,num2));
        System.out.println("The answer subtract is: " + add.subtract(num1,num2));
        System.out.println("The answer multiply is: " + add.multiply(num1,num2));
        System.out.println("The answer division is: " + add.division(num1,num2));

    }
}