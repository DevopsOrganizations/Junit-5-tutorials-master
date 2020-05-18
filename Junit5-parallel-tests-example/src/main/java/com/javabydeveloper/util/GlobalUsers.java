package com.javabydeveloper.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GlobalUsers {
	
	private static Map<Integer, String> GLOBAL_USERS = new HashMap<>();
	
	public static String get(int id) {
		return GLOBAL_USERS.get(id);
	} 
	
	public static void add(int id, String user) {
		GLOBAL_USERS.put(id, user);
	}
	
	public static void update(int id, String user) {
		GLOBAL_USERS.put(id, user);
	}

	public static void remove(int id) {
		GLOBAL_USERS.remove(id);
	}
	
	public static void clear() {
		GLOBAL_USERS.clear();
	}
	
	public static Collection<String> getUsers() {
		return GLOBAL_USERS.values();
	}	
	
	public static void setUsers(Map<Integer, String> users) {
		GLOBAL_USERS = users;
	}
}
