package com.javabydeveloper.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.javabydeveloper.test")
@IncludePackages("com.javabydeveloper.test.payment")
public class Junit5andJuni4_TestSuite_Test {

}
