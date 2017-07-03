package com.polarizer.registrationservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserServiceClient userServiceClient;
	
	@RequestMapping("/")
	public String hello() {
		return "Registration Service";
	}
	
	@RequestMapping("/registrations")
    public List<User> index() {
//		List<ServiceInstance> instances = this.discoveryClient.getInstances("user-service");
//		UserServiceClient userServiceClient = Feign.builder().target(UserServiceClient.class, "http://user-service");
		System.out.println("-------" + userServiceClient.toString());
        return userServiceClient.findAll();
    }
}
