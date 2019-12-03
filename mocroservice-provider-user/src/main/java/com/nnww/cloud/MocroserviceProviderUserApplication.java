package com.nnww.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MocroserviceProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MocroserviceProviderUserApplication.class, args);
	}
}
