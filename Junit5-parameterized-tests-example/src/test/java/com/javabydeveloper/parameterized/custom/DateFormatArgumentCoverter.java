package com.javabydeveloper.parameterized.custom;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class DateFormatArgumentCoverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) {
    	
    	DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    	              
        return LocalDate.parse(source.toString(), format);
    }
}
