package com.javabydeveloper.util;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//@Execution(ExecutionMode.CONCURRENT)
@Tag("group1")
public class Parallel1_Test {
	
	@Test
	void test1A() {
		System.out.println(Thread.currentThread().getName()+" => test1A");
	}
	
	@Test
	void test1B() {
		System.out.println(Thread.currentThread().getName()+" => test1B");
	}

	@Test
	void testC() {
		System.out.println(Thread.currentThread().getName()+" => test1C");
	}	
}
