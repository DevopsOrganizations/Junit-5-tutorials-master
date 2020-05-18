package com.javabydeveloper.test.payment;

import org.junit.jupiter.api.Tag;

@Tag("regression")
public class Junit5_Payment_Test {

	@Tag("acceptance")
	@Tag("baseline")
	@org.junit.jupiter.api.Test // Junit 5 test
	void payment_success_test() {
		System.out.println("payment_success_test(): " + Thread.currentThread().getName());
	}

	@Tag("acceptance")
	@org.junit.jupiter.api.Test // Junit 5 test
	void payment_decline_test() {
		System.out.println("payment_decline_test(): " + Thread.currentThread().getName());
	}

	@Tag("security")
	@org.junit.jupiter.api.Test // Junit 5 test
	void invalid_country_test() {
		System.out.println("invalid_country_test(): " + Thread.currentThread().getName());
	}
}
