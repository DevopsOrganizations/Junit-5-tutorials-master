package com.javabydeveloper.timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.javabydeveloper.util.MathUtil;

/*
 * JUnit 5 test using assertTimeoutPreemptively
 */

public class Junit5_AssertTimeoutPreemptively_Test {
	
	@Test
	void test_Add() throws Exception {
		
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> 
                           TimeUnit.SECONDS.sleep(10)); 
        
        assertTimeout(Duration.ofSeconds(10), () -> { 
                       assertEquals(5, MathUtil.add(3, 2));
                       System.out.println("test_Add()");
                    });
	}
	
	@Test
	void test_Multiply() throws Exception {
		
        assertTimeout(Duration.ofSeconds(9), () -> 
                           TimeUnit.SECONDS.sleep(10)); 
        
        assertTimeout(Duration.ofSeconds(10), () -> { 
                       assertEquals(6, MathUtil.multiple(3, 2));
                       System.out.println("MathUtil.multiple()");
                     });
	}
	
}
