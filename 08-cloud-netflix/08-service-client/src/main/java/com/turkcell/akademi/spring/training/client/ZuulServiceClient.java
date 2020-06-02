package com.turkcell.akademi.spring.training.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="zuul-proxy")
public interface ZuulServiceClient {

	@GetMapping("/w/welcome")
	public String getWelcomeMessage();
	
}
