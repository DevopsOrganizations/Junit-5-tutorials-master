package com.javabydeveloper.parameterized.external;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

public class ExternalArgsProvider {

	static Stream<Arguments> nameIdRoleProvider() {
        return Stream.of(
            arguments("Peter", 1, "admin"),
            arguments("John", 2, "author"),
            arguments("Philip", 3, "subscriber")
        );
    }
}
