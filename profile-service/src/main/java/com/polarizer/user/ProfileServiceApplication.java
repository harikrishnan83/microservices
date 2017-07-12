package com.polarizer.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableEurekaClient
@EnableResourceServer
@SpringBootApplication
public class ProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
	}

//	@Configuration
//	@EnableResourceServer
//	protected static class ResourceServer extends ResourceServerConfigurerAdapter {
//		@Override
//		public void configure(HttpSecurity http) throws Exception {
//			http.requestMatchers().antMatchers("/").and().authorizeRequests().anyRequest().access("#oauth2.hasScope('read')");
//		}
//	}
}
