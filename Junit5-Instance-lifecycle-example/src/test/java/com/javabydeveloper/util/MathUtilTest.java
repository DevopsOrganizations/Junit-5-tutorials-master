package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MathUtilTest {
	
	private int result = 5;
	
	@Test
	void test_Add() {
		result = MathUtil.add(result, 5);
		System.out.println("test_Add(5,5) => "+result);
		assertEquals(10, result);
	}
	
	@Test
	void test_Multiply() {
		result = MathUtil.multiple(result, 5);
		System.out.println("test_Multiply(5,5) => "+result);
		assertEquals(25, result);
	}

	@Test
	void test_Devide() {
		result = MathUtil.devide(result, 5);
		System.out.println("test_Devide(5,5) => "+result);
		assertEquals(1, result);
	}	
}
