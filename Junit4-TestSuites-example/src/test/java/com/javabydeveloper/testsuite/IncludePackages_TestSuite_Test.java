package com.javabydeveloper.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Run Junit 5 tests in Junit 4")
@SelectPackages("com.javabydeveloper.test")
@IncludePackages("com.javabydeveloper.test.payment")
public class IncludePackages_TestSuite_Test {

}
