package com.turkcell.akademi.spring.training.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@Autowired
	WelcomeServiceClient welcomeServiceClient;
	
	@Autowired
	ZuulServiceClient zuulServiceClient;
	
	@GetMapping("/hello") 
	public String hello() {
		System.out.println("hello is called");
		return "hello world and " + zuulServiceClient.getWelcomeMessage();
	}
	
	@GetMapping("/say-hello") 
	public String sayHello() {
		return "I say hello to world";
	}
	
}
