package com.turkcell.akademi.spring.training.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="welcome-service")
public interface WelcomeServiceClient {

	@GetMapping("/welcome")
	public String getWelcomeMessage();
	
}
