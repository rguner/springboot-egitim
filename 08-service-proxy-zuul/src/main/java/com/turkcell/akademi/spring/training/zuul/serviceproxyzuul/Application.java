package com.turkcell.akademi.spring.training.zuul.serviceproxyzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// Clientdan giderken:
	// http://localhost:8900/hello
	// http://localhost:9900/welcome
	//
	// Zuul Proxyden giderken:
	// http://localhost:8080/h/hello
	// http://localhost:8080/w/welcome

}
