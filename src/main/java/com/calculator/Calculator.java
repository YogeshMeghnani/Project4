package com.iiitb.spe.calc;

import java.util.*;

public class Calculator {
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static double subtract(double a,double b)
	{
		return a-b;
	}
	public static double multiply(double a,double b)
	{
		return a*b;
	}
	public static double divide(double a,double b)
	{
		return a/b;
	}
	public static void main(String args[]) {
		boolean execute = true;
		int choice;
		double number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Basic Calculator System");
		System.out.println("");
		do {
			System.out.println("Option Menu for Basic Operations");
			System.out.println("");
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Division");
			System.out.println("4) Multiplication");
			System.out.println("5) Exit");
			choice = sc.nextInt();
			if (choice == 5) {
				execute = false;
			} else {
				switch (choice) {
				case 1:
					System.out.println("Addition");
					System.out.println("Enter the two numbers");
					System.out.println("Enter number 1");
					number1 = sc.nextDouble();
					System.out.println("Enter number 2");
					number2 = sc.nextDouble();
					System.out.println(add(number1,number2));
					System.out.println("");
					break;

				case 2:
					System.out.println("Subtraction");
					System.out.println("Enter two numbers");
					System.out.print("Enter number 1: ");
					number1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					number2 = sc.nextDouble();
					System.out.println(subtract(number1,number2));
					break;
				
				case 3:
					System.out.println("Division");
					System.out.println("Enter two numbers");
					System.out.print("Enter number 1: ");
					number1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					number2 = sc.nextDouble();
					if (number2 == 0) {
						System.out.println("Divisor cannot divide by zero");

					} else {
						System.out.println(divide(number1,number2));
					}
					break;

				case 4:
					System.out.println("Multiplication");
					System.out.println("Enter two numbers");
					System.out.print("Enter number 1: ");
					number1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					number2 = sc.nextDouble();
					System.out.println(multiply(number1,number2));
					break;
				
				default:
					System.out.println("Exiting program due to invalid input");
					execute = false;

				}
			}
		} while (execute == true);
	}

}
