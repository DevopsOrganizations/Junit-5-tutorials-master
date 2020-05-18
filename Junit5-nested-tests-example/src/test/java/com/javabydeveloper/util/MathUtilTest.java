package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class MathUtilTest {
	
	@Test
	void test_Add() {
		System.out.println(Thread.currentThread().getName()+" MathUtilTest.test_Add");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@Test
	void test_Multiply() {
		System.out.println(Thread.currentThread().getName()+" MathUtilTest.test_Multiply");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@Test
	void test_Devide() {
		System.out.println(Thread.currentThread().getName()+" MathUtilTest.test_Devide");
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@Test
	void testIs_Prime() {
		System.out.println(Thread.currentThread().getName()+" MathUtilTest.testIs_Prime");
		assertTrue(MathUtil.isPrime(13));
	}
}
