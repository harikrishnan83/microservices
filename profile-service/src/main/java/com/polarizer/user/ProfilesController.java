package com.polarizer.user;

import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProfilesController {
	@RequestMapping("/")
	public String hello(Principal principal) {
		printRequester(principal);
		return "User Service";
	}
	
	@RequestMapping("/users")
    public List<Profile> index(Principal principal) {
		printRequester(principal);
		List<Profile> users = new ArrayList<Profile>();
		users.add(new Profile("hari@polarizer.in", "Hari Krishnan"));
		users.add(new Profile("nalini@polarizer.in", "Nalini"));
		return users;
    }

	private void printRequester(Principal principal) {
		if(principal != null) {
			System.out.println("Requested by - " + principal.getName());
		}
	}	
}
