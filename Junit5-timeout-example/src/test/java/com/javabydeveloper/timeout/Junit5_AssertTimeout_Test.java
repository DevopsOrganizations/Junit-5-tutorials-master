package com.javabydeveloper.timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.Timeout;

import com.javabydeveloper.util.MathUtil;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/*
 * JUnit 5 test using assertTimeout
 */

public class Junit5_AssertTimeout_Test {
	
	@Test
	void test_Add() throws Exception {
		
        assertTimeout(Duration.ofSeconds(5), () -> { 
        	           TimeUnit.SECONDS.sleep(4);
                       assertEquals(5, MathUtil.add(3, 2));
                       System.out.println("test_Add()");
                    });
	}
	
	@Test
	void test_Multiply() throws Exception {
		
		assertTimeout(Duration.ofSeconds(5), () -> { 
		        TimeUnit.SECONDS.sleep(10);
	            assertEquals(5, MathUtil.add(3, 2));
	            System.out.println("test_Multiply()");
	         });
	}
	
	@Test
	void test_assertTimeoutPreemptively() throws Exception {
		
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> { 
	        TimeUnit.SECONDS.sleep(10);
            assertEquals(5, MathUtil.add(3, 2));
            System.out.println("test_assertTimeoutPreemptively()");
        });
	}
	
	@TestFactory
	@Timeout(5)
	Collection<DynamicTest> test_dynamicTestsTimeouts() {
		return Arrays.asList(
				
				dynamicTest("1st dynamic test", () -> {
					TimeUnit.SECONDS.sleep(3);
					assertEquals(5, MathUtil.add(3, 2));
					System.out.println("Dynamic Test 1");
				}),
				
				dynamicTest("2nd dynamic test", () -> {
					TimeUnit.SECONDS.sleep(2);
					assertEquals(6, MathUtil.multiple(3, 2));
					System.out.println("Dynamic Test 2");
				}));
	}
	
	@TestFactory
	Collection<DynamicTest> test_dynamicTests_AssertTimeouts() {
		return Arrays.asList(
				
				dynamicTest("3rd dynamic test", () -> {
					assertTimeout(Duration.ofSeconds(5), () -> { 
	        	           TimeUnit.SECONDS.sleep(10);
	                       assertEquals(5, MathUtil.add(3, 2));
	                       System.out.println("Dynamic Test 3");
	                    });
				}),
				
				dynamicTest("4th dynamic test", () -> {
					assertTimeoutPreemptively(Duration.ofSeconds(5), () -> { 
	        	           TimeUnit.SECONDS.sleep(10);
	                       assertEquals(5, MathUtil.add(3, 2));
	                       System.out.println("Dynamic Test 4");
	                    });
				}));
	}
	
}
