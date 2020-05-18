package com.javabydeveloper.test.registration;

import org.junit.jupiter.api.Test;

public class Junit5_SDD_Test {

	@Test
	void simpl_dueDeligence_pass_Test() {
		System.out.println("simpl_dueDeligence_pass_Test(): " + Thread.currentThread().getName());
	}

	@Test
	void simpl_dueDeligence_fail_Test() {
		System.out.println("simpl_dueDeligence_fail_Test(): " + Thread.currentThread().getName());
	}
}
