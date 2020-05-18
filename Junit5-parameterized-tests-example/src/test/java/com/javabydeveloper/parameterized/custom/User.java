package com.javabydeveloper.parameterized.custom;

import java.time.LocalDate;

public class User {
	
	private String name;
	private long id;
	private String role;
	private LocalDate dateOfBirth;
	
	public User(String name, long id, String role, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
		
}
