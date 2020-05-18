package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInfo;

public class Junit5_DynamicTest_Lifecycle_Test {

	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Before execute "+info.getTestMethod().get().getName());
	}

	@TestFactory
	Collection<DynamicTest> dynamicTestsFromCollection() {

		return Arrays.asList(
				dynamicTest("1st dynamic test", () -> System.out.println("Dynamic test 1")),
				dynamicTest("2nd dynamic test", () -> System.out.println("Dynamic test 2")));
	}

	
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("After execute "+info.getTestMethod().get().getName());
	}
}
