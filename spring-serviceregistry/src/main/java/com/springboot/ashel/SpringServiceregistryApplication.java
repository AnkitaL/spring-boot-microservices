package com.springboot.ashel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringServiceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceregistryApplication.class, args);
	}

}
