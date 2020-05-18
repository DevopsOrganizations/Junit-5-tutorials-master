package com.javabydeveloper.service;

import java.util.HashMap;
import java.util.Map;

import com.javabydeveloper.model.User;

public class UserService {
	
	public static Map<Long, User> users = new HashMap<Long, User>();
	
	public static void saveOrUpdate(User user) {
		users.put(user.getId(), user);
	}
	
	public static void remove(User user) {
		users.remove(user.getId());
	}
	
	
}
