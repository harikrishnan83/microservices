package com.polarizer.registrationservice;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "polarizer-profile-service", fallback = ProfileServiceFallback.class)
public interface ProfileServiceClient {
	@RequestMapping(method = RequestMethod.GET, value = "/users")
    List<Profile> findAll();
}