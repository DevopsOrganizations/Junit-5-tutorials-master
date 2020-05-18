package com.javabydeveloper.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.javabydeveloper.parameterized.custom.CustomArgumentProvider;


public class Junit5_ArgumentSource_Test {
	
    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void testWith_implicit_conversion(String str, int num, List<String> list) {
    	System.out.println("str => "+str+"; num =>"+num+"; list => "+list);
    	assertTrue(str.length() >= 0);
        assertTrue(num >=1 && num <=3);
        assertTrue(list.size() >= 1);
    }           
}
