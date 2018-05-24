package com.p4parttime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class P4pZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(P4pZuulGatewayApplication.class, args);
	}
}
