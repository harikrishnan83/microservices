package com.polarizer.registrationservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
public class RegistrationController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/")
    public String index() {
		List<ServiceInstance> instances = this.discoveryClient.getInstances("user-service");
        return "Registration Service " + instances.get(0);
    }
}
