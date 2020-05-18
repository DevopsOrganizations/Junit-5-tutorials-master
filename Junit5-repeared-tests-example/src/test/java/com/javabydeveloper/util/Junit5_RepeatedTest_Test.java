package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Junit5_RepeatedTest_Test {
	
	@RepeatedTest(1)
	static void test_Add() {
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@Test
	void test_Multiply() {
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@RepeatedTest(3)
	void test_Devide() {
		System.out.println("test_Devide()");
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@RepeatedTest(2)
	void test_IsPrime() {
		System.out.println("test_IsPrime()");
		assertTrue(MathUtil.isPrime(13));
	}
}
