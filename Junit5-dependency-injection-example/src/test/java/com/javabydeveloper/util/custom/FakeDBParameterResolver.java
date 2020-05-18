package com.javabydeveloper.util.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Parameter;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class FakeDBParameterResolver implements ParameterResolver {

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.PARAMETER)
	public @interface FakeDB {
	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
		return parameterContext.isAnnotated(FakeDB.class);
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
		return getFakeDBConnection(parameterContext.getParameter(), extensionContext);
	}

	private Object getFakeDBConnection(Parameter parameter, ExtensionContext extensionContext) {

		Class<?> type = parameter.getType();
		FakeDBConnection connection = extensionContext.getRoot().getStore(Namespace.GLOBAL)//
				.getOrComputeIfAbsent(FakeDBConnection.class);

		if (FakeDBConnection.class.equals(type))
			return connection;

		throw new ParameterResolutionException("No FakeDbConnection implemented for " + type);
	}
}
