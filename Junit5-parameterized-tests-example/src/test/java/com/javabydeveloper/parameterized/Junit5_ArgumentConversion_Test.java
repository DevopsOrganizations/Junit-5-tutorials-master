package com.javabydeveloper.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;

import com.javabydeveloper.parameterized.custom.DateFormatArgumentCoverter;


public class Junit5_ArgumentConversion_Test {
	
	 @ParameterizedTest
	 @ValueSource(strings = {"2017-03-14", "2020-01-20"})
	 void testWith_implicit_conversion(LocalDate localDate) {
	    System.out.println("localDate => "+localDate.toString());
	    assertTrue(localDate != null);
	 
	 } 
	 
	 @ParameterizedTest
	 @ValueSource(strings = {"03-21-2017", "01-28-2020"})
	 void testWith_explicit_conversion(
			 @ConvertWith(DateFormatArgumentCoverter.class) LocalDate localDate) {
	    System.out.println("localDate => "+localDate.toString());
	    assertTrue(localDate != null);
	 
	 } 
}
