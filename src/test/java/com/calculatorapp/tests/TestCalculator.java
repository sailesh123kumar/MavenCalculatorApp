package com.calculatorapp.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.calculatorapp.Calculator;



public class TestCalculator {
	
	private Calculator cal = new Calculator();

	
	@Test(description = "Verify Calculator divide Functionality for dividing the number with zero and it throws Exception", groups = {"smoke", "sanity"},expectedExceptions = ArithmeticException.class)
	public void divide_DivideNumberByZero_ThrowArithmeticException() {
	cal.divide(40, 0);
	}

}
