package com.javabydeveloper.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class Junit5_NestedLifecycle_Test {

	@Test
	void test1() {
		System.out.println("=> ---test1()");
	}

	@Nested
	@TestInstance(Lifecycle.PER_CLASS)
	class TestA {

		@BeforeAll
		void testA_BeforeAll() {
			System.out.println("=> ---testA_BeforeAll()");
		}

		@BeforeEach
		void testA_BeforeEach() {
			System.out.println("=> ---testA_BeforeEach()");
		}

		@Test
		void testA_test1() {
			System.out.println("=> ---testA_test1()");
		}
	}
}
