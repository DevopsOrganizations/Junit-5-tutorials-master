package com.javabydeveloper.timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.javabydeveloper.util.MathUtil;

/*
 * A test for JUnit 5 global tiemouts
 * @see junit-platform.properties
 */

public class Junit5_Timeout_ConfigurationParam_Test {
	
	@BeforeEach
    void setUp() throws Exception {
		TimeUnit.SECONDS.sleep(4);
		System.out.println("@BeforeEach");
		System.out.println("-------------------------");
    }
	
	@BeforeAll
    static void setUpBeforeAllTests() throws Exception {
		TimeUnit.SECONDS.sleep(4);
		System.out.println("@BeforeAll");
    }
	
	@Test
	void test_Add() throws Exception {
		TimeUnit.SECONDS.sleep(4);
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@Test
	void test_Multiply() throws Exception {
		TimeUnit.SECONDS.sleep(4);
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@AfterEach
    void cleanup() throws Exception {
		TimeUnit.SECONDS.sleep(4);
		System.out.println("@AfterEach");
		System.out.println("-------------------------");
    }
	
	@AfterAll
    static void cleanupAfterAllTests() throws Exception {
		TimeUnit.SECONDS.sleep(4);
		System.out.println("@AfterAll");
    }
}
