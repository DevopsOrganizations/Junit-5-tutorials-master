package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * @TestMethodOrder using MethodOrderer.Random
 */

@TestMethodOrder(MethodOrderer.Random.class)
public class Junit5_RandomOrder_Annotation_Test {
	
	@Test
	@Order(1)
	void test_Add() {
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@Test
	@Order(2)
	void test_Multiply() {
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@Test
	@Order(3)
	void test_Devide() {
		System.out.println("test_Devide()");
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@Test
	@Order(4)
	void test_IsPrime() {
		System.out.println("test_IsPrime()");
		assertTrue(MathUtil.isPrime(13));
	}
}
