package com.p4parttime.P4pServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class P4pServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(P4pServiceDiscoveryApplication.class, args);
	}
}
