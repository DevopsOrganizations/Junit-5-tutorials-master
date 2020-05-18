package com.javabydeveloper.conditional.extension;

import static org.junit.platform.commons.util.AnnotationUtils.findAnnotation;

import java.lang.reflect.AnnotatedElement;
import java.util.Optional;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.engine.script.Script;
import org.junit.jupiter.engine.script.ScriptAccessor;

import com.javabydeveloper.conditional.custom.MyCustomDisabledIf;

public class MyDisabledIfConditionExtension implements ExecutionCondition {

	private static final ConditionEvaluationResult ENABLED = ConditionEvaluationResult
			.enabled("@MyCustomDisabledIf is not present");

	/**
	 * Containers/tests are disabled if {@code @MyCustomDisabledIf} is present on the test
	 * class or method.
	 */
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		Optional<AnnotatedElement> element = context.getElement();
		Optional<MyCustomDisabledIf> disabled = findAnnotation(element, MyCustomDisabledIf.class);
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		boolean result = false;

		Bindings bindings = createBindings(context);
		engine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
		String script = String.join(System.lineSeparator(), disabled.get().value());
		try {
			result = (Boolean) engine.eval(script);
		} catch (ScriptException e) {
			e.printStackTrace();
		}

		if (result)
			return ConditionEvaluationResult.disabled("@MyDisabledIf is present with valid condition");

		return ENABLED;
	}

	private Bindings createBindings(ExtensionContext context) {
		ScriptAccessor configurationParameterAccessor = new ScriptAccessor.ConfigurationParameterAccessor(context);
		Bindings bindings = new SimpleBindings();
		bindings.put(Script.BIND_JUNIT_TAGS, context.getTags());
		bindings.put(Script.BIND_JUNIT_UNIQUE_ID, context.getUniqueId());
		bindings.put(Script.BIND_JUNIT_DISPLAY_NAME, context.getDisplayName());
		bindings.put(Script.BIND_JUNIT_CONFIGURATION_PARAMETER, configurationParameterAccessor);
		bindings.put("systemEnvironment", System.getenv());
		bindings.put("systemProperty", System.getProperties());
		return bindings;
	}

}
