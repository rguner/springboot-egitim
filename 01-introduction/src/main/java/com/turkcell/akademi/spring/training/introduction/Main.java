package com.turkcell.akademi.spring.training.introduction;

import com.turkcell.akademi.spring.training.introduction.service.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		System.out.println("hello world");
	}

	@Autowired
	DateTimeService dateTimeService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world : " + dateTimeService.getCurrentTime());

	}

}
