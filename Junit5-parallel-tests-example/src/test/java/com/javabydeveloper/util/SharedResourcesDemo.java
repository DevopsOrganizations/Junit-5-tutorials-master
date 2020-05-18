package com.javabydeveloper.util;

import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

@Disabled
@Execution(ExecutionMode.CONCURRENT)
public class SharedResourcesDemo {

	private Properties backup;

    @BeforeEach
    void backup() {
        backup = new Properties();
        backup.putAll(System.getProperties());
    }

    @AfterEach
    void restore() {
        System.setProperties(backup);
    }

    @Test
    //@ResourceLock(value = Resources.SYSTEM_PROPERTIES, mode = ResourceAccessMode.READ)
    void customPropertyIsNotSetByDefault() {
    	System.out.println("customPropertyIsNotSetByDefault=> "+System.getProperty("my.prop"));
        Assertions.assertNull(System.getProperty("my.prop"));
    }

    @Test
    @ResourceLock(value = Resources.SYSTEM_PROPERTIES, mode = ResourceAccessMode.READ_WRITE)
    void canSetCustomPropertyToApple() {
    	
        System.setProperty("my.prop", "apple");
        System.out.println("canSetCustomPropertyToApple=> "+System.getProperty("my.prop"));
        Assertions.assertEquals("apple", System.getProperty("my.prop"));
    }

    @Test
    //@ResourceLock(value = Resources.SYSTEM_PROPERTIES, mode = ResourceAccessMode.READ_WRITE)
    void canSetCustomPropertyToBanana() {
        System.setProperty("my.prop", "banana");
        System.out.println("canSetCustomPropertyToBanana=> "+System.getProperty("my.prop"));
        Assertions.assertEquals("banana", System.getProperty("my.prop"));
    }
}
