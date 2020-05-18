package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class Junit5_Dynamic_Test {

	// Static test 1
	@Test
	void test_Add() {
		assertEquals(5, MathUtil.add(3, 2));
	}

	// This method produces Dynamic test cases
	@TestFactory
	Collection<DynamicTest> dynamicTestsFromCollection() {

		return Arrays.asList(
				dynamicTest("1st dynamic test", () -> assertTrue(MathUtil.isPrime(13))),
				dynamicTest("2nd dynamic test", () -> assertEquals(5, MathUtil.devide(25, 5))));
	}

	// Static test 2
	@Test
	void test_Devide() {
		assertEquals(5, MathUtil.devide(25, 5));
	}
}
