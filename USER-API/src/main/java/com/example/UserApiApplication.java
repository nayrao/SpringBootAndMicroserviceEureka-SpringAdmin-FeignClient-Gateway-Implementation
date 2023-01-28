package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.FeignClientExample;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class UserApiApplication {
	@Autowired
	private FeignClientExample clientExample;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}
	
	@GetMapping("/user")
	public String user() {
		 ResponseEntity<String> welcomeCreated = clientExample.welcomeCreated();
		
		
		return "Hi Rajarao....."+welcomeCreated;
	}

}
