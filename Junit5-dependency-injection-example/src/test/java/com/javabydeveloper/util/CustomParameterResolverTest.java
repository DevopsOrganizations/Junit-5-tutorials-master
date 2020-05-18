package com.javabydeveloper.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.javabydeveloper.util.custom.FakeDBConnection;
import com.javabydeveloper.util.custom.FakeDBParameterResolver;
import com.javabydeveloper.util.custom.FakeDBParameterResolver.FakeDB;

@ExtendWith(FakeDBParameterResolver.class)
public class CustomParameterResolverTest {

	@Test
	void injectFakeDbTest(@FakeDB FakeDBConnection connection) {

		connection.getAllUserNames().forEach(System.out::println);

		Assertions.assertTrue(connection.getAllUserNames().contains("peterm"));
	}
}
