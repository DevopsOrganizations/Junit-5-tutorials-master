package com.javabydeveloper.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.RepeatedTest;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@RepeatedTest(value = 3, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
public @interface MyRepeatedTest {

}
