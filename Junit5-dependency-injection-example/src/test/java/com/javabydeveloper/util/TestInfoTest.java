package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoTest {
	
	// for each test a new instance create (lifecycle per-method default behaviour)
	public TestInfoTest(TestInfo info) {
		System.out.println("------------------");
		System.out.println("$$$ "+info.getDisplayName()+" $$$");
		System.out.println("------------------");
	}
	
	@BeforeEach
	void beforeEach(TestInfo testInfo) {
		// here initialize setup for each test
		System.out.println("Before Strat test >>>> "+testInfo.getTestMethod().get().getName());
	}
	
	@Tag("my-tag")
	@DisplayName("MathUtil.add_test()")
	@Test
	void test_Add(TestInfo testInfo) {
		System.out.println(">>>> Start test_Add() ");
		System.out.println(testInfo.getDisplayName());
		System.out.println(testInfo.getTestMethod().get().getName());
		testInfo.getTags().forEach(System.out::println);
		assertEquals(5, MathUtil.add(3, 2));
	}	
}
