package com.assiginment.softwareProcessQuality;

public interface calculator {
	int sum(int a, int b);

	int subtraction(int a, int b);

	int multiplication(int a, int b);

	int divison(int a, int b) throws Exception;

	boolean equalIntegers(int a, int b);

	int calcPower(int a, int b);
}
