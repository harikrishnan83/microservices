package com.polarizer.registrationservice;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "polarizer-user-service", fallback = UserServiceFallback.class)
public interface UserServiceClient {
	@RequestMapping(method = RequestMethod.GET, value = "/users")
    List<User> findAll();
}