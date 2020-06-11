package com.tutorialspoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InterceptorApplication {
   public static void main(String[] args) {
      SpringApplication.run(InterceptorApplication.class, args);
   }
}