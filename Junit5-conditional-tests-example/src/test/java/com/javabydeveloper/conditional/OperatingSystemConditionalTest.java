package com.javabydeveloper.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OperatingSystemConditionalTest {
	
	@Test
	@EnabledOnOs(OS.MAC)
	void runOnlyOnMacOs() {
	    System.out.println("Run the batch job only on MAC OS");
	}

	@Test
	@EnabledOnOs({ OS.LINUX, OS.MAC })
	void runOnlyOnLinuxOrMac() {
		System.out.println("Run the batch job only on LINUX or MAC OS");
	}

	@Test
	@DisabledOnOs(OS.WINDOWS)
	void notRunOnWindows() {
		System.out.println("Not run the batch job on WINDOWS OS");
	}
	
	@Test
	@EnabledOnOs({ OS.WINDOWS })
	void runOnlyOnWindows() {
		System.out.println("Run the batch job only on WINDOWS OS");
	}
	
	@Test
    @DisabledOnOs({OS.AIX, OS.LINUX, OS.SOLARIS})
    void notRunOnAIXorLinuxOrSolaris() {
        System.out.println("Not run the batch job on AIX or LINUX or SOLARIS");
    }

}
