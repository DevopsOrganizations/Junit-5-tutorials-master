package com.javabydeveloper.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.javabydeveloper.test.payment")
@ExcludeTags("acceptance&baseline")
public class ExcludeTags_TestSuite_Test {

}
