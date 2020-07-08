package com.example.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class SleuthApplication {

	private static final Logger LOG = Logger.getLogger(SleuthApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(SleuthApplication.class, args);
	}


	@RequestMapping("/")
	public String index() {
		LOG.log(Level.INFO, "Index API is calling");
		return "Welcome Sleuth!";
	}
}
