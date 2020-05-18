package com.javabydeveloper.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags(value = 
 {@Tag("regression"),
  @Tag("user_module")
 })
public class Junit5_Tag_Test {
	
	@Tag("issue-19162")
	@Test
	void user_create_test() {
		System.out.println("user_create_test()");
	}
	
	@Tag("issue-19163")
	@Test
	void user_login_sso() {
		System.out.println("user_login_sso()");
	}

	@Tag("accessibility")
	@Test
	void user_accessability_test1() {
		System.out.println("accessibility_test1()");
	}
	
	@Tag("security")
	@Test
	void user_security_test1() {
		System.out.println("security_test1()");
	}
	
	@Tag("api")
	@Test
	void user_api_test1() {
		System.out.println("api_test1()");
	}
	
	@Tag("api")
	@Test
	void user_api_test2() {
		System.out.println("api_test2()");
	}
	
	@Tag("load")
	@Test
	void user_load_test1() {
		System.out.println("load_test1()");
	}
	
	@Tag("performance")
	@Test
	void user_performance_test1() {
		System.out.println("performance_test1()");
	}
}
