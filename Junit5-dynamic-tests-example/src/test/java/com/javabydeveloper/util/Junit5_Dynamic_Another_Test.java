package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Junit5_Dynamic_Another_Test {

	@TestFactory
	DynamicTest dynamicTest() {
		return DynamicTest.dynamicTest("Single dynamic test", 
				() -> assertTrue(MathUtil.isPrime(13)));
	}

	@TestFactory
	DynamicContainer dynamicTestsFromStream() {
		return DynamicContainer.dynamicContainer("DynamicContainer",
			Stream.of(
					DynamicTest.dynamicTest("1st container test",
							() -> assertTrue(MathUtil.isPrime(13))),
					DynamicTest.dynamicTest("2nd container test",
							() -> assertEquals(5, MathUtil.devide(25, 5))
			)));
	}
	
	// This method produces Dynamic test cases
	@TestFactory
	Stream<DynamicNode> dynamicTestsFromCollection() {

		return Stream.of(7, 13)
		      .map(number -> DynamicContainer.dynamicContainer("Prime or Odd Test"+number,
				Stream.of(
					DynamicTest.dynamicTest("is number "+number+" prime?",
							() -> assertTrue(MathUtil.isPrime(number))),
					DynamicTest.dynamicTest("is number "+number+" odd?", 
							() -> assertFalse(MathUtil.isEven(number))
				))));
	}
}
