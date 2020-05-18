package com.javabydeveloper.conditional;

import com.javabydeveloper.conditional.custom.RunOnlyOn64bitWindows10;


public class CustomConditionalTest {

	@RunOnlyOn64bitWindows10
	void runOnlyOn64bitWindows10() {
		System.out.println("Run only this on 64 bit Windows 10 System.");
	}
}
