package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
public class Junit5_TestInstance_Lifecycle_Test {
	

	@BeforeEach
	void beforeEach(TestInfo testInfo) {
		// here initialize setup for each test
		System.out.println("Before Strat test >>>> "+testInfo.getTestMethod().get().getName());
	}

	@Test
	void test_Add() {
		System.out.println("MathUtil.add(5, 5) => "+MathUtil.add(5, 5));
		assertEquals(10, MathUtil.add(5, 5));
	}
	
	@Test
	void test_Multiply() {

		System.out.println("MathUtil.multiple(5, 5) => "+MathUtil.multiple(5, 5));
		assertEquals(25, MathUtil.multiple(5, 5));
	}

	
	@AfterEach
	void afetrEach(TestInfo testInfo) {
		// here cleanup setup after each test completes
		System.out.println("After complete test >>>> "+testInfo.getTestMethod().get().getName());
	}
	
	@AfterAll
	void afetrAll() {
		// here cleanup setup after all tests completes
		System.out.println("--- After tests completed ---");
	}	
}
