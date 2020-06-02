package com.turkcell.akademi.spring.training.serviceclient.serviceclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome";
	}

}
