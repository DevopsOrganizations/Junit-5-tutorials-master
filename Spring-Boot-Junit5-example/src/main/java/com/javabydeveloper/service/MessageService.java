package com.javabydeveloper.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	public String getSubscriptionMessage(String user) {
		
		return "Hello "+user+", Thanks for the subscription!";
	}
}
