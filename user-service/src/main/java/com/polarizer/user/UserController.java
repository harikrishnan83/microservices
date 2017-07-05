package com.polarizer.user;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {
	@RequestMapping("/")
	public String hello() {
		return "User Service";
	}
	
	@RequestMapping("/users")
    public List<User> index() {
		List<User> users = new ArrayList<User>();
		users.add(new User("hari@polarizer.in", "Hari Krishnan"));
		users.add(new User("a@polarizer.in", "a"));
        return users;
    }	
}
