package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class WelcomeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApiApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Raja IT In Future Have a Dream to achive";
	}
}
