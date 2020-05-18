package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Junit5_Dynamic_Parameterized_Test {

	@TestFactory
	Collection<DynamicTest> dynamicTestsFromCollection() {

		List<DynamicTest> dynamicTests = new ArrayList<DynamicTest>();
		
		Arrays.asList(7, 13, 17)
		      .forEach(number -> {
		    	  dynamicTests.add(
		    			  dynamicTest("is number "+number+" prime?",
		    		                 () -> assertTrue(MathUtil.isPrime(number))));
		    	  
		    	  dynamicTests.add(
		    			  dynamicTest("is number "+number+" even?",
		    		                 () -> assertFalse(MathUtil.isEven(number))));
		            });
		
		return dynamicTests;
	}
}
