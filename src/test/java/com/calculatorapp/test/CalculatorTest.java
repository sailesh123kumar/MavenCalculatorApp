package com.calculatorapp.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.calculatorapp.Calculator;

/**
 * Maven commands:
 *
 * <pre>
 * mvn clean              - Deletes the artifacts in target folder
 * mvn validate           - Checks project structure in pom.xml
 * mvn compile            - Compiles classes in src/main/java
 * mvn test-compile       - Compiles classes in src/test/java
 * mvn test               - Executes test classes
 *                          (maven-surefire plugin auto-binds to run tests)
 * mvn package            - Creates jar file in target folder
 * mvn verify             - Runs verification checks (e.g. vulnerability)
 * mvn install            - Installs jar into local .m2 repository
 * mvn deploy             - Deploys project to remote repo (e.g. Nexus)
 *                          (helps share reusable code across teams)
 *
 * Additional useful commands:
 * mvn -Dbrowser=Chrome test
 * mvn -Dtest=CalculatorTest.java test
 * mvn -Dtest=CalculatorTest.java#methodName test
 * mvn package -DskipTests
 * </pre>
 */




public class CalculatorTest {
	
	private Calculator cal = new Calculator();

	@Test(description = "Verify Calculator Add Functionality for addition of 2 Numbers", groups = {"smoke", "sanity"})
	public void add_TwoIntegerNumbers_returnResult() {
		System.out.println("");
		System.out.println("==================================");
		String browserName = System.getProperty("browser");
		System.out.println("");
		System.out.println("Browser Name : "+browserName);
		System.out.println("");
		System.out.println("==================================");
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

	@Test(description = "Verify Calculator divide Functionality for division of 2 Numbers", groups = {"smoke", "sanity"})
	public void divide_TwoDouubleNumbers_returnResult() {
		assertEquals(cal.divide(40, 2), 20.0);
	}
	
	@Test(description = "Verify Calculator divide Functionality for dividing the number with zero and it throws Exception", groups = {"smoke", "sanity"},expectedExceptions = ArithmeticException.class)
	public void divide_DivideNumberByZero_ThrowArithmeticException() {
	cal.divide(40, 0);
	}

}
