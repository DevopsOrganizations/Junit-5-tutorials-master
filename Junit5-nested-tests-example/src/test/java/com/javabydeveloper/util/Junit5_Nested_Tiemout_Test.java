package com.javabydeveloper.util;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Timeout;

@Timeout(value = 900, unit = TimeUnit.MILLISECONDS)
public class Junit5_Nested_Tiemout_Test {

	@Test
	void test1() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(1000); // waits 1000 ms
		System.out.println("=> ---test1()");
	}
	
	@Test
	void test2() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(500); // waits 500 ms
		System.out.println("=> ---test2()");
	}

	@Nested
	@TestInstance(Lifecycle.PER_CLASS)
	class TestA {

		@BeforeAll
		void testA_BeforeAll() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(1000); // waits 1000 ms
			System.out.println("=> ---testA_BeforeAll()");
		}

		@BeforeEach
		void testA_BeforeEach() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(1000); // waits 1000 ms
			System.out.println("=> ---testA_BeforeEach()");
		}

		@Test
		void testA_test1() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(1000); // waits 1000 ms
			System.out.println("=> ---testA_test1()");
		}
		
		@Test
		void testA_test2() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(100); // waits 100 ms
			System.out.println("=> ---testA_test2()");
		}
	}
}
