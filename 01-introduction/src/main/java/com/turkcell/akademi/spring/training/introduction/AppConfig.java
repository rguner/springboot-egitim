package com.turkcell.akademi.spring.training.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class AppConfig {

	@Bean
	// @Scope("prototype")
	public Date myDateBean() {
		return new Date();
	}

}
