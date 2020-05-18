package com.javabydeveloper.conditional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertiesConditionalTest {
	
	@Disabled
	@Test
	void printSystemProperties() {
		//remove @Disabled to see System properties
		System.getProperties().forEach((key, value) -> System.out.println(key+" - "+value));
	}

	@Test
	@EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
	void runOnlyOnOracleJDK() {
		System.out.println("Run this only on Oracle JDK");
	}

	@Test
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
	void runOnlyOn32bitOS() {
		System.out.println("Run this on only on 32 bit OS");
	}
	
	@Test
	@DisabledIfSystemProperty(named = "os.version", matches = ".*10.*")
	void notRunOnlyOnWindows10() {
		System.out.println("not run this only on windows 10 version");
	}
	
	@Test
	@EnabledIfSystemProperty(named = "os.version", matches = ".*10.*")
	void runOnlyOnWindows10() {
		System.out.println("Run this only on WINDOWS OS 10 version");
	}
}
