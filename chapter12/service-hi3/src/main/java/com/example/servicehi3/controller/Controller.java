package com.example.servicehi3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @author: fangjc
 * @create: 2021-07-19 21:04
 **/
@RestController
@Service
@Configuration
public class Controller {
    @Autowired
    public RestTemplate restTemplate;
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @GetMapping("/hi")
    public String service3(@RequestParam String name){
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);

    }
}
