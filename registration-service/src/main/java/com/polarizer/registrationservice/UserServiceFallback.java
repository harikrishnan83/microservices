package com.polarizer.registrationservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserServiceClient {

	@Override
	public List<User> findAll() {
		System.out.println("------Fallback");
		List<User> fallbackUsers = new ArrayList<User>();
		return fallbackUsers;
	}
	
}