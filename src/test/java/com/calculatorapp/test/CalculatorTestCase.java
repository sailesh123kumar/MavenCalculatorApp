package com.calculatorapp.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.calculatorapp.Calculator;



public class CalculatorTestCase {
	
	private Calculator cal = new Calculator();

	@Test(description = "Verify Calculator Add Functionality for addition of 2 Numbers", groups = {"smoke", "sanity"})
	public void add_TwoIntegerNumbers_returnResult() {
		assertEquals(cal.add(20, 30), 50);
	}

	@Test(description = "Verify Calculator Sub Functionality for subtraction of 2 Numbers", groups = {"smoke"})
	public void sub_TwoIntegerNumbers_returnResult() {
		assertEquals(cal.sub(40, 30), 10);
	}

	@Test(description = "Verify Calculator Multiply Functionality for multiplication of 2 Numbers", groups = {"smoke"})
	public void multiply_TwoIntegerNumbers_returnResult() {
		assertEquals(cal.multiply(40, 30), 1200);
	}

}
