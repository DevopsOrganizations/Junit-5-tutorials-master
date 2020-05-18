package com.javabydeveloper.test.registration;

import org.junit.jupiter.api.Test;

public class Junit5_Registration_Test {

	@Test
	void registration_Success_Test() {
		System.out.println("registration_Success_Test(): " + Thread.currentThread().getName());
	}

	@Test
	void registration_Fail_On_DocCheck_Test() {
		System.out.println("registration_Fail_On_DocCheck_Test(): " + Thread.currentThread().getName());
	}
}
