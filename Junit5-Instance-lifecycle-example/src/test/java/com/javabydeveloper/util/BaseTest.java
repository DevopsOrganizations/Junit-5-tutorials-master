package com.javabydeveloper.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class BaseTest {

	@BeforeAll
	static void beforeAll() {
		// here common setup for all tests
		System.out.println("--- Before starting tests --- ");
	}
	
	@AfterAll
	static void afetrAll() {
		// here cleanup setup after all tests completes
		System.out.println("--- After tests completed ---");
	}	
}
