package com.polarizer.user;

import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {
	@RequestMapping("/")
	public String hello(Principal principal) {
		System.out.println("Requested by - " + principal.getName());
		return "User Service";
	}
	
	@RequestMapping("/users")
    public List<User> index(Principal principal) {
		System.out.println("Requested by - " + principal.getName());
		List<User> users = new ArrayList<User>();
		users.add(new User("hari@polarizer.in", "Hari Krishnan"));
		users.add(new User("nalini@polarizer.in", "Nalini"));
		return users;
    }	
}
