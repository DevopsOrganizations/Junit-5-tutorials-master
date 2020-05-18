package com.javabydeveloper.test.payment;

public class Junit4_Surcharge_Test {

	// Junit 4 test case
	@org.junit.Test
	public void surcharge_merchant_test() {
		// ..currentThread().getName() - just to print thread name which is running current test
		System.out.println("surcharge_merchant_test(): " + Thread.currentThread().getName());
	}

	// Junit 4 test case
	@org.junit.Test
	public void surcharge_byCountry_test() {
		System.out.println("surcharge_byCountry_test(): " + Thread.currentThread().getName());
	}

	// Junit 4 test case
	@org.junit.Test
	public void surcharge_formula_test() {
		System.out.println("surcharge_formula_test(): " + Thread.currentThread().getName());
	}
}
