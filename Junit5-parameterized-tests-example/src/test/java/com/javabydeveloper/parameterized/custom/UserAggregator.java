package com.javabydeveloper.parameterized.custom;

import java.time.LocalDate;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class UserAggregator implements ArgumentsAggregator {
	
    @Override
    public User aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) {
    	return new User(accessor.getString(0),
				accessor.getLong(2),
				accessor.getString(1),
				accessor.get(3, LocalDate.class));
    }
}
