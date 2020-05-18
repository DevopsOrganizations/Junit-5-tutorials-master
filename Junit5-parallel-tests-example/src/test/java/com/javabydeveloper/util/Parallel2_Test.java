package com.javabydeveloper.util;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//@Execution(ExecutionMode.CONCURRENT)
@Tag("group2")
public class Parallel2_Test {
	
	@Test
	void test2A() {
		System.out.println(Thread.currentThread().getName()+" => test2A");
	}
	
	@Test
	void test2B() {
		System.out.println(Thread.currentThread().getName()+" => test2B");
	}

	@Test
	void test2C() {
		System.out.println(Thread.currentThread().getName()+" => test2C");
	}
}
