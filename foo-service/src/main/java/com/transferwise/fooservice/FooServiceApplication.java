package com.transferwise.fooservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class FooServiceApplication {
    
    static final String ID = UUID.randomUUID().toString();

    public static void main(String[] args) {
        SpringApplication.run(FooServiceApplication.class, args);
    }
    
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Answering with ID: " + ID);
        return "Hello, World! I am " + ID;
    }
}
