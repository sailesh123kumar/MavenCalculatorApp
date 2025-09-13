package com.calculatorapp;

public class Calculator {

	public int add(int num1, int num2) {
		System.out.println("===Addition===");
		System.out.println("Number One : "+num1);
		System.out.println("Number Two : "+num2);
		int result = num1 + num2;
		System.out.println("Result : "+num1 + " + "+num2 + " = "+result);
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		System.out.println("===Subtraction===");
		System.out.println("Number One : "+num1);
		System.out.println("Number Two : "+num2);
		int result = num1 - num2;
		System.out.println("Result : "+num1 + " - "+num2 + " = "+result);
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		System.out.println("===Multiplication===");
		System.out.println("Number One : "+num1);
		System.out.println("Number Two : "+num2);
		int result = num1 * num2;
		System.out.println("Result : "+num1 + " * "+num2 + " = "+result);
		return result;
	}
	
	public double divide(double num1, double num2) {
		
		if(num2==0) {
			throw new ArithmeticException();
		}
		
		System.out.println("===Division===");
		System.out.println("Number One : "+num1);
		System.out.println("Number Two : "+num2);
		double result = num1 / num2;
		System.out.println("Result : "+num1 + " / "+num2 + " = "+result);
		return result;
	}

}
