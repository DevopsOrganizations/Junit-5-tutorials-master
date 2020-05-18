package com.javabydeveloper.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import com.javabydeveloper.parameterized.custom.User;
import com.javabydeveloper.parameterized.custom.UserAggregator;


public class Junit5_ArgumentAggregation_Test {
	
	@ParameterizedTest
    @CsvSource({
    	"Peter, admin, 1, 2017-03-14",
    	"John, author, 2, 2017-03-14",
    	"Martin, subscriber, 3, 2017-03-14"
    })
    void testWith_ArgumentAccessor(ArgumentsAccessor accessor) {
		User user = new User(accessor.getString(0),
				accessor.getLong(2),
				accessor.getString(1),
				accessor.get(3, LocalDate.class));
    	System.out.println("name => "+user.getName()+
    			"; role => "+user.getRole()+
    			"; id => "+user.getId());
    	assertTrue(user.getName().length() >= 0);
        assertTrue(user.getId() >=1 && user.getId() <=3);
        assertTrue(!user.getRole().isEmpty());
    }  
	
	@ParameterizedTest
    @CsvSource({
    	"Peter, admin, 1, 2017-03-14",
    	"John, author, 2, 2017-03-14",
    	"Martin, subscriber, 3, 2017-03-14"
    })
    void testWith_ArgumentAggregator(@AggregateWith(UserAggregator.class) User user) {
    	System.out.println("name => "+user.getName()+
    			"; role => "+user.getRole()+
    			"; id => "+user.getId()+
    			"; dateOfBirth => "+user.getDateOfBirth().toString());
    	assertTrue(user.getName().length() >= 0);
        assertTrue(user.getId() >=1 && user.getId() <=3);
        assertTrue(!user.getRole().isEmpty());
    }
	 	
}
