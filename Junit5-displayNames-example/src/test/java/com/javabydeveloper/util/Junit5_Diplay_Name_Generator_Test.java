package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Junit5_Diplay_Name_Generator_Test {
	
	@Test
	void test_Add() {
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@Test
	void test_Multiply() {
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@Test
	void test_Devide() {
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@Test
	void test_IsPrime() {
		assertTrue(MathUtil.isPrime(13));
	}
}
