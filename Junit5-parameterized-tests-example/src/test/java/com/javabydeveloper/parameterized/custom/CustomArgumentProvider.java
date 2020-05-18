package com.javabydeveloper.parameterized.custom;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class CustomArgumentProvider implements ArgumentsProvider{

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		
		 return Stream.of(
		            arguments("Peter", 1, Arrays.asList("admin", "author")),
		            arguments("John", 2, Arrays.asList("subscriber")),
		            arguments("Philip", 3, Arrays.asList("Author", "Publisher"))
		        );
	}
}
