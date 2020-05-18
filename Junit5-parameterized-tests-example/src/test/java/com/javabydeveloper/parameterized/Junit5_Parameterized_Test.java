package com.javabydeveloper.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Junit5_Parameterized_Test {
	
	// This test will run sequentially 5 times with 1 argument each time
    @ParameterizedTest
    @ValueSource(ints = {8,4,2,6,10})
    void test_int_arrays(int arg) {
    	System.out.println("arg => "+arg);
        assertTrue(arg % 2 == 0);
    }   
}
