package com.javabydeveloper.parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


public class Junit5_CSVSource_Test {
	
    @ParameterizedTest
    @CsvSource({
    	"Peter, admin, 1",
    	"John, author, 2",
    	"Martin, subscriber, 3"
    })
    void testWith_CsvSource(String name, String role, long id) {
    	System.out.println("testWith_CsvSource: name => "+name+"; role => "+role+"; id => "+id);
    	assertTrue(name.length() >= 0);
        assertTrue(id >=1 && id <=3);
        assertTrue(!role.isEmpty());
    }  
    
    @ParameterizedTest
    @CsvSource({
    	"Peter, admin, 1",
    	"John, author, 2",
    	"Martin, , 3"
    })
    void testWith_CsvSource_with_null(String name, String role, long id) {
    	System.out.println("name => "+name+"; role => "+role+"; id => "+id);
    	assertTrue(name.length() >= 0);
        assertTrue(id >=1 && id <=3);
        assertTrue(role != null);
    } 
    
    // @CsvSource(value = { "Peter, NIL, 1" }, nullValues = "NIL")
    // above line provide arguments => Peter, null, 1 (Since Junit 5.6)
}
