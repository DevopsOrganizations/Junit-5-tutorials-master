package com.javabydeveloper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(Junit5_Custom_DisplayName_Generator_Test.MyDisplayNameGenerator.class)
public class Junit5_Custom_DisplayName_Generator_Test {
	
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
	
	static class MyDisplayNameGenerator extends DisplayNameGenerator.Standard {

        @Override
        public String generateDisplayNameForClass(Class<?> testClass) {
            return testClass.getSimpleName().replace("_", "");
        }

        @Override
        public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
            return super.generateDisplayNameForNestedClass(nestedClass) + "...";
        }

        @Override
        public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
            String name = testMethod.getName().replace("_", " ").replace("test", "");
            return testClass.getSimpleName().replace("_", "") +" : "+name;
        }
	}
}
