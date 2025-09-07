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

}
