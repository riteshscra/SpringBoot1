package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjApplication.class, args);
		
		System.out.println("My first Spring Boot Project in STS");
	}

}
