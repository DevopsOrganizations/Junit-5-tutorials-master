package com.javabydeveloper.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import com.javabydeveloper.tag.custom.PerformanceApiTag;

@Tags(value = 
 {@Tag("acceptance"),
  @Tag("payment_module")
 })
public class Junit5_CustomTag_Test {
	
	@Tag("accessibility")
	@Test
	void payment_accessibility_test1() {
		System.out.println("accessibility_test1()");
	}
	
	@PerformanceApiTag
	@Test
	void payment_performance_api_test1() {
		System.out.println("performance_api_test1()");
	}
	
	@Tag("load")
	@Test
	void payment_load_test1() {
		System.out.println("load_test1()");
	}
	
	@PerformanceApiTag
	@Test
	void payment_performance_api_test2() {
		System.out.println("performance_api_test2()");
	}
}
