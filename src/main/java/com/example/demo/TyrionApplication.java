package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TyrionApplication {

	@GetMapping("/msg")
	public String message(){
		return "hello hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(TyrionApplication.class, args);
	}

}
