package com.assiginment.softwareProcessQuality;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Vector;

public class calculatorTest {
	private static calculatorImpl calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new calculatorImpl();
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);
		assertEquals(7, result);
	}

	@Test
	public void testSubtraction() {
		int result = calculator.subtraction(10, 3);
		assertEquals(7, result);
	}

	@Test
	public void testMultiplication() {
		int result = calculator.multiplication(5, 6);
		assertEquals(30, result);
	}

	@Test
	public void testDivision() {
		try {
			int result = calculator.divison(10, 2);
			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}

	@Test
	public void testEqualIntegers() {
		boolean result = calculator.equalIntegers(20, 20);
		assertTrue(result);
	}

	@Test
	public void testNotEqualIntegers() {
		boolean result = calculator.equalIntegers(10, 20);
		assertFalse(result);
	}

	@Test
	public void testNegativeNumbers() {
		int result = calculator.sum(-5, -10);
		assertEquals(-15, result);
	}

	@Test
	public void testZeroDivision() {
		try {
			int result = calculator.divison(0, 5);
			assertEquals(0, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@After
	public void cleanUp() {
		// Perform any necessary clean up after each test
	}


}
