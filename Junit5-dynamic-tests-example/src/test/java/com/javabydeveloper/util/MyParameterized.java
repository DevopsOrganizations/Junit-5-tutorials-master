package com.javabydeveloper.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ParameterizedTest
@TestFactory
public @interface MyParameterized {

}
