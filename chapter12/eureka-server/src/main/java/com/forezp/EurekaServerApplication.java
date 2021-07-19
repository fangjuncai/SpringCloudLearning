package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	//无法加载主类
	//https://blog.csdn.net/weixin_29804623/article/details/99946708
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
