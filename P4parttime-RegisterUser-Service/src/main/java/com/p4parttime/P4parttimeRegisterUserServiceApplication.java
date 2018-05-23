package com.p4parttime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class P4parttimeRegisterUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(P4parttimeRegisterUserServiceApplication.class, args);
	}
}
