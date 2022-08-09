package com.Natwest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class NatwestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatwestApplication.class, args);
	}
	
}
