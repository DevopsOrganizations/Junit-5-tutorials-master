package com.javabydeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javabydeveloper.service.MessageService;

@RestController
public class HelloController {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam String user) {
		return messageService.getSubscriptionMessage(user);
	}

}
