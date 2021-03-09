package com.springboot.ashel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringServivegatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServivegatewayApplication.class, args);
	}

}
