package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class MathUtilTest {
	
	// for each test a new instance create (lifecycle per-method default behaviour)
	public MathUtilTest(TestInfo info) {
		System.out.println("------------------");
		System.out.println("$$$ "+info.getDisplayName()+" $$$");
		System.out.println("------------------");
	}
	
	@BeforeEach
	void beforeEach(TestInfo testInfo) {
		// here initialize setup for each test
		System.out.println("Before Strat test >>>> "+testInfo.getTestMethod().get().getName());
	}
	
	@Test
	void test_Add() {
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@Test
	void test_Multiply() {
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	
	@AfterEach
	void afterEach(TestInfo testInfo) {
		// here initialize setup for each test
		System.out.println("Afetr End test >>>> "+testInfo.getTestMethod().get().getName());
	}
	
}
