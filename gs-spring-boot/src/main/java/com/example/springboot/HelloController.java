package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Value("${spring.application.name}")
	private String name;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot! application name: " + name;
	}

}
