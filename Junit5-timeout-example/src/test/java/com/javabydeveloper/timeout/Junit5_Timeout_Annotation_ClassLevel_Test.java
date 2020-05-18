package com.javabydeveloper.timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.javabydeveloper.util.MathUtil;

/*
 * JUnit 5 @Timeout test at class level
 */

@Timeout(7) // each test fails if execution time exceeds 7 seconds
public class Junit5_Timeout_Annotation_ClassLevel_Test {
	
	@BeforeEach
    void setUp() throws Exception {
		TimeUnit.SECONDS.sleep(10); // waits 10 seconds
		System.out.println("@BeforeEach");
		System.out.println("-------------------------");
    }
	
	@BeforeAll
    static void setUpBeforeAllTests() throws Exception {
		TimeUnit.SECONDS.sleep(10);
		System.out.println("@BeforeAll");
    }
	
	@Test
	void test_Add() throws Exception {
		
		TimeUnit.SECONDS.sleep(10);
		assertEquals(5, MathUtil.add(3, 2));
		System.out.println("test_Add()");
	}
	
	@Test
	void test_Multiply() throws Exception {
		
		TimeUnit.SECONDS.sleep(5); // waits 3 seconds
		System.out.println("test_Multiply()");
	}
}
