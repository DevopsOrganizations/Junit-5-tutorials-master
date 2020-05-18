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
import org.junit.jupiter.params.provider.MethodSource;


public class Junit5_MethodSource_Test {
	
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWith_MethodSource(String arg) {
    	System.out.println("testWith_MethodSource(arg) => "+arg);
        assertNotNull(arg);
    }  
    
    @ParameterizedTest
    @MethodSource
    void testWith_Default_local_MethodSource(String arg) {
    	System.out.println("testWith_Default_local_MethodSource(arg) => "+arg);
        assertNotNull(arg);
    }  
    
    @ParameterizedTest(name="#{index} - Test with Argument={0},{1},{2}")
    @MethodSource("stringIntAndListProvider")
    void testWith_Multiple_MethodSource(String str, int num, List<String> list) {
    	System.out.println("str => "+str+"; num =>"+num+"; list => "+list);
    	assertTrue(str.length() >= 0);
        assertTrue(num >=1 && num <=3);
        assertTrue(list.size() >= 1);
    }  
    
    @ParameterizedTest(name="#{index} - Test with Argument={0},{1},{2}")
    @MethodSource("com.javabydeveloper.parameterized.external.ExternalArgsProvider#nameIdRoleProvider")
    void testWith_Multiple_ExternalMethodSource(String str, int num, String role) {
    	System.out.println("str => "+str+"; num =>"+num+"; role => "+role);
    	assertTrue(str.length() >= 0);
        assertTrue(num >=1 && num <=3);
        assertTrue(!role.isEmpty());
    }
    
    static Stream<String> stringProvider() {
        return Stream.of("admin", "subscriber", "author","anonymous");
    }
    
    static Stream<String> testWith_Default_local_MethodSource() {
        return Stream.of("Peter", "Philip", "John");
    }
    
    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
            arguments("Peter", 1, Arrays.asList("admin", "author")),
            arguments("John", 2, Arrays.asList("subscriber")),
            arguments("Philip", 3, Arrays.asList("Author", "Publisher"))
        );
    }      
}
