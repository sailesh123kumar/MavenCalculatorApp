package com.calculatorapp.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.calculatorapp.Calculator;



public class Calculator2Test {
	
	private Calculator cal = new Calculator();

	@Test(description = "Verify Calculator Add Functionality for addition of 2 Numbers", groups = {"smoke", "sanity"})
	public void add_TwoIntegerNumbers_returnResult() {
		assertEquals(cal.add(20, 30), 50);
	}

	

}
