package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * @TestMethodOrder using built in Alphanumeric
 */

@TestMethodOrder(Alphanumeric.class)
public class Junit5_Alphanumeric_Order_Test {
	
	@Test
	void test_Add() {
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@Test
	void test_Multiply() {
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@Test
	void test_Devide() {
		System.out.println("test_Devide()");
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@Test
	void test_IsPrime() {
		System.out.println("test_IsPrime()");
		assertTrue(MathUtil.isPrime(13));
	}
}
