package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// here is the communication between two apis
@FeignClient(name = "WELCOME-API")
public interface FeignClientExample {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeCreated();
}
