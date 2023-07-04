package com.azure.github.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureGithubActionApplication {
	@GetMapping("/hello")
	public String message(){
		return "Hello from Spring boot First Web app";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureGithubActionApplication.class, args);
	}

}
