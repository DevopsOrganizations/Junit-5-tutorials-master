package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class Junit5_DynamicTests_Order_Test {
	
	@TestFactory
	Collection<DynamicTest> test_dynamicTests_AssertTimeouts() {
		
	    List<DynamicTest> dynamicTests = Arrays.asList(
	            dynamicTest("1st dynamic test", () -> { 
	            	assertTrue(MathUtil.isPrime(13)); 
	            	System.out.println("=> 1st dynamic test");
	            }),
	            dynamicTest("2nd dynamic test", () -> {
	            	assertEquals(5, MathUtil.devide(25, 5));
	            	System.out.println("=> 2nd dynamic test");
	            }),
	            dynamicTest("3rd dynamic test", () -> { 
	            	assertEquals(12, MathUtil.add(7, 5)); 
	            	System.out.println("=> 3rd dynamic test");
	            })
	        );
	    
	     sortDynamicTests(dynamicTests);
	    return dynamicTests;
	  }
	
	static void sortDynamicTests(List<DynamicTest> dynamicTests) {
		dynamicTests.sort((DynamicTest d1, DynamicTest d2) -> 
        d2.getDisplayName().compareTo(d1.getDisplayName()));
	}
}
