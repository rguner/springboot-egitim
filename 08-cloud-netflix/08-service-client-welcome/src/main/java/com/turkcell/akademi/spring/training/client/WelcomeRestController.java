package com.turkcell.akademi.spring.training.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome") 
	public String sayHello() {
		System.out.println("welcome is called...");
		return "welcome to the real world";
	}
}
