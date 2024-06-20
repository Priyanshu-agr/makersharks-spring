package com.example.Sharks.Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SharksApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(SharksApi2Application.class, args);
	}

}
