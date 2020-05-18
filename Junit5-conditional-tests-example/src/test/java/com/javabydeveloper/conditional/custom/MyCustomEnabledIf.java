package com.javabydeveloper.conditional.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.javabydeveloper.conditional.extension.MyEnabledIfConditionExtension;



@Test
@ExtendWith(MyEnabledIfConditionExtension.class)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomEnabledIf {

	String[] value();
	String reason() default "Script `{source}` evaluated to: {result}";
	String engine() default "Nashorn";

}
