package com.cloudshop.endpoint.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer

public class ProductCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCloudConfigApplication.class, args);
	}
}