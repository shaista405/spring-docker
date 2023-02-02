package com.example.dockerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringdockerApplication {
	@GetMapping("/welcome")
	public String welcome()
	{
		return "spring boot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdockerApplication.class, args);
	}

}
