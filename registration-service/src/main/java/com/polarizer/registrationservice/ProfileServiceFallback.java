package com.polarizer.registrationservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProfileServiceFallback implements ProfileServiceClient {

	@Override
	public List<Profile> findAll() {
		System.out.println("------Fallback");
		List<Profile> fallbackUsers = new ArrayList<Profile>();
		return fallbackUsers;
	}
	
}