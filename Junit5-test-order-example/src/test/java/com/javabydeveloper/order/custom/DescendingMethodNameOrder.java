package com.javabydeveloper.order.custom;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;

public class DescendingMethodNameOrder implements MethodOrderer {

	@Override
    public void orderMethods(MethodOrdererContext context) {
        context.getMethodDescriptors().sort((MethodDescriptor m1, MethodDescriptor m2) -> 
        m2.getMethod().getName().compareTo(m1.getMethod().getName()));
    }
 }
