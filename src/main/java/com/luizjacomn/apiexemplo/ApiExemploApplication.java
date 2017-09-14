package com.luizjacomn.apiexemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApiExemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiExemploApplication.class, args);
	}
}
