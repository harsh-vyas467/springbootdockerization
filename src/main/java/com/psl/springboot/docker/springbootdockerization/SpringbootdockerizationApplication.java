package com.psl.springboot.docker.springbootdockerization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdockerizationApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "I am working fine";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerizationApplication.class, args);
	}

}
