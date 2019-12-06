package com.davise.jwt_authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://medium.com/@dassum/securing-spring-boot-rest-api-with-json-web-token-and-jdbc-token-store-67558a7d6c29
@SpringBootApplication
public class JwtAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationApplication.class, args);
	}

}
