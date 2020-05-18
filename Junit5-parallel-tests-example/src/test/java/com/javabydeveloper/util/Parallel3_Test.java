package com.javabydeveloper.util;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//@Execution(ExecutionMode.CONCURRENT)
@Tag("group3")
public class Parallel3_Test {
	
	@Test
	void test3A() {
		System.out.println(Thread.currentThread().getName()+" => test3A");
	}
	
	@Test
	void test3B() {
		System.out.println(Thread.currentThread().getName()+" => test3B");
	}

	@Test
	void test3C() {
		System.out.println(Thread.currentThread().getName()+" => test3C");
	}
}
