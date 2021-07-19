package com.example.servicehi3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
public class ServiceHi3Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHi3Application.class, args);
	}

}
