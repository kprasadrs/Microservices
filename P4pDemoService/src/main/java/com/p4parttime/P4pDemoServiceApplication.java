package com.p4parttime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class P4pDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(P4pDemoServiceApplication.class, args);
	}
}
