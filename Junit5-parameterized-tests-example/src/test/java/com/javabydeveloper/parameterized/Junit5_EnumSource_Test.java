package com.javabydeveloper.parameterized;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;


public class Junit5_EnumSource_Test {
	
	enum Role {
        ADMIN, SUBSCRIBER, OBSERVER, AUTHOR, PUBLISHER, ANONYMOUS
    }
	
    @ParameterizedTest
    @EnumSource(Role.class)
    void testWith_EnumSource(Role role) {
    	System.out.println("arg => "+role);
        assertNotNull(role);
    }  
    
    @ParameterizedTest
    @EnumSource(value = Role.class, names = {"AUTHOR", "SUBSCRIBER"})
    void testWith_EnumSource_include(Role role) {
    	System.out.println("arg => "+role);
        assertNotNull(role);
    } 
    
    @ParameterizedTest
    @EnumSource(value = Role.class, mode = Mode.EXCLUDE, names = {"AUTHOR", "SUBSCRIBER"})
    void testWith_EnumSource_exclude(Role role) {
    	System.out.println("arg => "+role);
        assertNotNull(role);
    } 
    
    @ParameterizedTest
    @EnumSource(value = Role.class, mode = Mode.MATCH_ALL, names = "^(A|S).*R$")
    void testWith_EnumSource_Regex(Role role) {
    	System.out.println("---------");
    	System.out.println("arg => "+role);
        assertNotNull(role);
    }  
}
