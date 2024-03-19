package com.assiginment.softwareProcessQuality;

import java.util.Vector;

public class calculatorImpl implements calculator {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}

	@Override
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}

	@Override
	public int calcPower(int base, int exponent) {
		int result = 1;

		for (int i = 0; i < exponent; i++) {
			result *= base;
		}

		return result;
	}
}
