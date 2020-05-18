package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Junit5_DynamicTests_Timeout_Test {
	
	@TestFactory
	List<DynamicTest> test_dynamicTests_AssertTimeouts() {
	    return Arrays.asList(
	        
	        dynamicTest("1st dynamic test", () -> {
	           assertTimeout(Duration.ofSeconds(5), () -> { 
	                       //TimeUnit.SECONDS.sleep(10);
	                         assertEquals(5, MathUtil.add(3, 2));
	                         System.out.println("Dynamic Test 3");
	                      });
	        }),
	        
	        dynamicTest("2nd dynamic test", () -> {
	           assertTimeoutPreemptively(Duration.ofSeconds(5), () -> { 
	                       //TimeUnit.SECONDS.sleep(10);
	                         assertEquals(5, MathUtil.add(3, 2));
	                         System.out.println("Dynamic Test 4");
	                      });
	        }));
	  }
}
