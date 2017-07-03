package com.polarizer.registrationservice;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="user-service",url="${user-service.ribbon.listOfServers}")
public interface UserServiceClient {
	@RequestMapping(method = RequestMethod.GET, value = "/users")
    List<User> findAll();
}
