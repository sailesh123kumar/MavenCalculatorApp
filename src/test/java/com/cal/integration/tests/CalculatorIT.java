package com.cal.integration.tests;

import static org.testng.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.calculatorapp.Calculator;

public class CalculatorIT {

	Calculator cal;
	File outputFile;
	File outPutDir;

	@BeforeClass(description = "setup the calculator object and artifact folder")
	public void setUp() {
		cal = new Calculator();
		outPutDir = new File("target/integrationTest");

		if (outPutDir.exists()) {
			outPutDir.mkdir();
		}

		outputFile = new File(outPutDir, "integrationResult.txt");

	}

	
	@Test
	public void calculatorIntegrationTest() {
		int addResult = cal.add(20, 10);
		int subResult = cal.sub(20, 10);
		int multiplyResult = cal.multiply(12, 12);
		double divideResult = cal.divide(20, 10);

		List<String> lines = Arrays.asList(addResult + "", subResult + "", multiplyResult + "", divideResult + "");
		List<String> actual = null;

		try {
			FileUtils.writeLines(outputFile, lines, true);
			actual = FileUtils.readLines(outputFile, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertTrue(outputFile.exists(), "===FILE NOT FOUND===");
		assertEquals(actual, lines, "===MISMATCH FOUND IN FILE===");
	}

}
