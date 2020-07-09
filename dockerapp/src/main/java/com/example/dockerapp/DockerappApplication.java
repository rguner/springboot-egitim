package com.example.dockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerappApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World from DockerApp";
	}

}