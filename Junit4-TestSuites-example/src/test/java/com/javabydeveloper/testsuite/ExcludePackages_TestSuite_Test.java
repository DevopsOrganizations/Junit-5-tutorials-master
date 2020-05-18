package com.javabydeveloper.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.javabydeveloper.test")
@ExcludePackages("com.javabydeveloper.test.payment")
public class ExcludePackages_TestSuite_Test {

}
