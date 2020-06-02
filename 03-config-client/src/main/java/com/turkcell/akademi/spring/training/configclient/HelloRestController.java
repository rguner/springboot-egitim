package com.turkcell.akademi.spring.training.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // config serverdan refresh edilen beanler
public class HelloRestController {

	@Value("${message}")
	String message;

	@GetMapping("/")
	public String getMessage() {
		return message;
	}

}
