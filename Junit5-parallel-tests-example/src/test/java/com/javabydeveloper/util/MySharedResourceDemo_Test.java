package com.javabydeveloper.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.jupiter.api.parallel.ResourceLock;


@Execution(ExecutionMode.CONCURRENT)
public class MySharedResourceDemo_Test {

	final static String GLOBAL_USERS = "com.javabydeveloper.util.GlobalUsers.users";
	
	@BeforeEach
    void initiate() {
        GlobalUsers.clear();
    }
	
	@Test
    @ResourceLock(value = GLOBAL_USERS, mode = ResourceAccessMode.READ)
    void isEmpty_Test() {
    	System.out.println("isEmpty_Test() : "+GlobalUsers.getUsers());
        Assertions.assertTrue(GlobalUsers.getUsers().isEmpty());
    }
	
	@Test
    @ResourceLock(value = GLOBAL_USERS, mode = ResourceAccessMode.READ_WRITE)
    void add_Test() {
		GlobalUsers.add(1, "peter");
    	System.out.println("add_Test() : "+GlobalUsers.getUsers());
        Assertions.assertEquals("peter", GlobalUsers.get(1));
    }
	
	@Test
    @ResourceLock(value = GLOBAL_USERS, mode = ResourceAccessMode.READ_WRITE)
    void update_Test() {
		GlobalUsers.update(1, "john");
    	System.out.println("update_Test() : "+GlobalUsers.getUsers());
        Assertions.assertEquals("john", GlobalUsers.get(1));
    }
	
	@Test
    @ResourceLock(value = GLOBAL_USERS, mode = ResourceAccessMode.READ_WRITE)
    void remove_Test() {
		GlobalUsers.add(2, "Anand");
		GlobalUsers.remove(2);
    	System.out.println("remove_Test() : "+GlobalUsers.getUsers());
        Assertions.assertNull(GlobalUsers.get(2));
    }
}
