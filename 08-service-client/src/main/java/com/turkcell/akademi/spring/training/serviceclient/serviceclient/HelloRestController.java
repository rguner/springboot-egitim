package com.turkcell.akademi.spring.training.serviceclient.serviceclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hello")
	public String getMessage() {
		System.out.println("hello cagrildi...");
		return "Hello";
	}

}
