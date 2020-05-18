package com.javabydeveloper.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

import com.javabydeveloper.model.User;

public class JUnit5_Assumptions_Test {
	
	// assumeTrue() -> Run only if environment is DEV
	@Test
    void testOnlyOnDevEnvironment() {
        assumeTrue("DEV".equals(System.getenv("ENV_SETUP")));

        User user = new User(1, "Peter", "peterm@email.com");
        UserService.saveOrUpdate(user);
        assertTrue(UserService.users.get(new Long(1)) == user);
    }
	
	// assumeFalse() -> Run only if environment is not PROD
	@Test
    void testOnlyIfNotOnProdEnvironment() {
        assumeFalse("PROD".equals(System.getenv("ENV_SETUP")));

        User user = new User(1, "Peter", "peterm@email.com");
        UserService.saveOrUpdate(user);
        assertTrue(UserService.users.get(new Long(1)) == user);
    }

	// assumeTrue() -> Run only if environment is DEV, if not display message
    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV_SETUP")),
            () -> "Aborting test: not on developer workstation");
        
        User user = new User(1, "Peter", "peterm1@email.com");
        UserService.saveOrUpdate(user);
        assertTrue(UserService.users.get(new Long(1)) == user);
    }

    // assumeThat()
    @Test
    void testInAllEnvironments() {
        assumingThat("DEV".equals(System.getenv("ENV_SETUP")),
            () -> {
                // perform these assertions only on the DEV server
            	UserService.saveOrUpdate(new User(1, "Peter", "peterm@email.com"));
            });

        // perform these assertions in all environments
        User user = new User(1, "Peter", "peterm1@email.com");
        UserService.saveOrUpdate(user);
        assertTrue(UserService.users.get(new Long(1)) == user);
    }
}
