package com.turkcell.akademi.spring.training.webrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloRestController {

	// actuator için management.security.enabled=false
	// Spring security’s kapatıyorum.
	//
	//
	// http://localhost:8080/metrics
	// http://localhost:8080/health
	// http://localhost:8080/env
	// http://localhost:8080/trace

	@GetMapping("/")
	public String sayHello() {
		return "hello world";
	}

	// http://localhost:8080/model
	@GetMapping("/model")
	public HelloModel sayHelloAsModel() {
		HelloModel helloModel = new HelloModel();
		helloModel.setTimeStamp(new Date());
		helloModel.setMessage("hello world selam 2");
		return helloModel;
	}

	@PostMapping("/model")
	public HelloModel repeatHello(@RequestBody HelloModel helloModel) {
		helloModel.setTimeStamp(new Date());
		helloModel.setMessage(helloModel.getMessage() + " REVISED..");

		return helloModel;
	}

}
