package com.javabydeveloper.conditional;

import com.javabydeveloper.conditional.custom.MyCustomDisabledIf;
import com.javabydeveloper.conditional.custom.MyCustomEnabledIf;



public class MyCustomConditionalTest {
	
	
	@MyCustomDisabledIf("'sysUsername' == systemEnvironment.get('USERNAME')")
	void notRunForSpecificUser() {
		System.out.println("not run this for specific user");
	}
	
	@MyCustomEnabledIf("/64/.test(systemProperty.get('os.arch'))")
	void runOnlyOn64bitMachine() {
		System.out.println("Run this only 64bit System");
	}

}
