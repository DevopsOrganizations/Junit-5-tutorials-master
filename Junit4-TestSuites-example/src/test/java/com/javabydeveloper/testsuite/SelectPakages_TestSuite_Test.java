package com.javabydeveloper.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Test Suite with @SelectPackages")
@SelectPackages({
	"com.javabydeveloper.test.payment",
	"com.javabydeveloper.test.registration"})
public class SelectPakages_TestSuite_Test {

}
