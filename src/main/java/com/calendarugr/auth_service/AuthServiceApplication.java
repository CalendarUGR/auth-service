package com.calendarugr.auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthServiceApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		System.setProperty("JWT_SECRET", dotenv.get("JWT_SECRET"));
		System.setProperty("API_KEY", dotenv.get("API_KEY"));
		System.setProperty("EUREKA_URL", dotenv.get("EUREKA_URL"));
		SpringApplication.run(AuthServiceApplication.class, args);
	}

}
