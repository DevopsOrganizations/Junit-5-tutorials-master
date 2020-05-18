package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Junit5_RepeatedTest_RepetitionInfo_Test {
	
	@BeforeEach
    void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getTestMethod().get().getName();
        
        System.out.println(String.format("About to execute repetition %d of %d for %s", //
                currentRepetition, totalRepetitions, methodName));
    }
	
	@Test
	void test_Add(RepetitionInfo repetitionInfo) {
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@RepeatedTest(1)
	void test_Multiply() {
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@RepeatedTest(3)
	void test_Devide() {
		System.out.println("test_Devide()");
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@RepeatedTest(2)
	void test_IsPrime(RepetitionInfo repetitionInfo) {
		assertEquals(2, repetitionInfo.getTotalRepetitions());
		System.out.println("test_IsPrime()");
		assertTrue(MathUtil.isPrime(13));
	}
}
