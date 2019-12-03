package com.nnww.mocroserviceserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MocroserviceServiceEurekaApplication {

	public static void main(String[] args) {
		System.out.println("eureka服务");
		SpringApplication.run(MocroserviceServiceEurekaApplication.class, args);
	}
}
