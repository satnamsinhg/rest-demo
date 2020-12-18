package com.rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestDemoApplication {

	@GetMapping("/")
	public String welcome(){
		return "welcome to rest demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

}
