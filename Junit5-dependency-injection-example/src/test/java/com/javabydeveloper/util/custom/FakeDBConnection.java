package com.javabydeveloper.util.custom;

import java.util.Arrays;
import java.util.List;

public class FakeDBConnection {

	public List<String> getAllUserNames() {
		return Arrays.asList("peterm", "mikek", "johna", "anandv");
	}
}
