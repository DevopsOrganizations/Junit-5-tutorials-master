package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.javabydeveloper.custom.MyRepeatedTest;

public class Junit5_RepeatedTest_CustomAnnotation_Test {
	
	@MyRepeatedTest
	static void test_Add() {
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@MyRepeatedTest
	void test_Multiply() {
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@MyRepeatedTest
	void test_Devide() {
		System.out.println("test_Devide()");
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@MyRepeatedTest
	void test_IsPrime() {
		System.out.println("test_IsPrime()");
		assertTrue(MathUtil.isPrime(13));
	}
}
