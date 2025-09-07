package com.calculatorapp.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.calculatorapp.Calculator;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator cal = new Calculator();
		Assert.assertEquals(cal.add(20, 30), 50);
	}

}
