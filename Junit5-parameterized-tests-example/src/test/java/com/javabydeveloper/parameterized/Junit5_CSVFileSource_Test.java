package com.javabydeveloper.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class Junit5_CSVFileSource_Test {
	
    @ParameterizedTest
    @CsvFileSource(resources = "/users-data.csv", numLinesToSkip = 1)
    void testWith_MethodSource(String name, String role, long id) {
    	System.out.println("name => "+name+"; role => "+role+"; id => "+id);
    	assertTrue(name.length() >= 0);
        assertTrue(id >=1 && id <=3);
        assertTrue(!role.isEmpty());
    }          
}
