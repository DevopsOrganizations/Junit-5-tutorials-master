package com.javabydeveloper.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JavaRuntimeEnvironmentConditionalTest {
	
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void runOnlyOnJava8() {
	    System.out.println("Run the compatibility test only on JRE 8");
	}

	@Test
	@EnabledOnJre({JRE.JAVA_13, JRE.JAVA_14})
	void runOnlyOnJava13OrJava14() {
		System.out.println("Run the compatibility test only on JRE 13 and JRE 14");
	}

	@Test
	@DisabledOnJre(JRE.JAVA_13)
	void notRunOnJava13() {
		System.out.println("not run the compatibility test on JRE 13");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	void runOnlyOnJava11() {
		System.out.println("Run the compatibility test only on JRE 11");
	}
	
	@Test
	@DisabledOnJre({JRE.JAVA_10, JRE.JAVA_11})
    void notRunOnJava10andJava11() {
		System.out.println("not Run the compatibility test on JRE 10 and JRE 11");
    }
	
}
