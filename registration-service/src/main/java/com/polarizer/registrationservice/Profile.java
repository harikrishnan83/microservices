package com.polarizer.registrationservice;

public class Profile {
	private String email;
	private String name;
	
	public Profile() {
	}
	
	public Profile(String email, String name) {
		this.email = email;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
