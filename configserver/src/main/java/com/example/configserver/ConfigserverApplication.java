package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {
	/*

	açıldıktan sonra:
	http://localhost:8888/config-client/default/master

	DEV profile
	http://localhost:8888/config-client/dev

	 */

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

}
