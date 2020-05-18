package com.javabydeveloper.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.javabydeveloper.test.payment")
@ExcludeClassNamePatterns("^.*Surcharge.*") // should match test calss, not method
public class ExcludeClassNamePattern_TestSuite_Test {

}
