package com.javabydeveloper.conditional;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;


public class ScriptBasedConditionalTest {
	
	@Disabled
	@DisplayName("Java Nashorn script Test")
	@Test
	void nashornTest(TestInfo testinfo) {
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			// remove @Disabled to Demonstrating how nashorn script works
			Object result1 = engine.eval("2 * 3 == 6");
			
			System.out.println("(2 * 3 == 6) => "+result1);
			
			Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);
			bindings.put("systemProperty", System.getProperties());
			bindings.put("junitDisplayName", testinfo.getDisplayName());
			bindings.put("junitTags", testinfo.getTags());
			engine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
			
			System.out.println("systemProperty.get('os.arch')) => "+engine.eval("systemProperty.get('os.arch')"));
			System.out.println("junitDisplayName => "+engine.eval("junitDisplayName"));
			System.out.println("junitTags => "+engine.eval("junitTags"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Static JavaScript expression.
	@Test
	@EnabledIf("2 * 3 == 6")
	void runOnlyIfExpressionValueTrue() {
		System.out.println("(2 * 3 == 6) => true");
	}
	
	// Regular expression testing bound system property.
	@Test
	@DisabledIf("/32/.test(systemProperty.get('os.arch'))")
	void notRunOn32bitOS() {
		System.out.println("Not run this on 32 bit OS");
	}
	
	@Test
	@EnabledIf("'admin' == systemEnvironment.get('USERNAME')")
	void runOnlyForSpecificUser() {
		System.out.println("Run this only for specific user");
	}
	
	// Multi-line script, can give custom engine name and custom reason.
	@Test
	@EnabledIf(value = {
            "load('classpath:script/myScript.js')",
            "",
            "myfunction(10) == true"
        },
        engine = "javascript",
        reason = "On {annotation}, with script: {script}, result is: {result}\"")
	void runOnlyOnlyIfValueIsEven() {
		System.out.println("Run this only for Even numbers");
	}
}
