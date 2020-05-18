package com.javabydeveloper.util;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5_Nested_Order_Test {

	@Test
	//@Order(1)
	void test2() {
		System.out.println("=> test2()");
	}

	@Nested
	//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	class TestB {

		@Test
		//@Order(1)
		void testB_test2() {
			System.out.println("=> testB_test2()");
		}

		@Test
		//@Order(2)
		void testB_test1() {
			System.out.println("=> testB_test1()");
		}
	}

	@Nested
	//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
	class TestC {

		@Test
		void testC_test2() {
			System.out.println("=> testC_test2()");
		}

		@Test
		void testC_test1() {
			System.out.println("=> testC_test1()");
		}
	}

	@Nested
	class TestA {

		@Test
		void testA_test2() {
			System.out.println("=> testA_test2()");
		}

		@Test
		void testA_test1() {
			System.out.println("=> testA_test1()");
		}

		@Nested
		class TestAA {

			@Test
			void testAA_test2() {
				System.out.println("=> testAA_test2()");
			}

			@Test
			void testAA_test1() {
				System.out.println("=> testAA_test1()");
			}
		}

		@Nested
		class TestAB {

			@Test
			void testAB_test1() {
				System.out.println("=> testAB_test1()");
			}

			@Nested
			class TestABA {

				@Test
				void testABA_test1() {
					System.out.println("=> testABA_test1()");
				}
			}
		}

		@Test
		void testA_test3() {
			System.out.println("=> testA_test3()");
		}
	}

	@Test
	//@Order(2)
	void test3() {
		System.out.println("=> test3()");
	}

	@Test
	//@Order(3)
	void test1() {
		System.out.println("=> test1()");
	}
}
