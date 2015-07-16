package com.transferwise.fooservice;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class BarServiceApplication {
    
    @Autowired
    FooService fooService;
    
    @Autowired
    RestTemplate restTemplate;
    
    public static void main(String[] args) {
        SpringApplication.run(BarServiceApplication.class, args);
    }
    
    @RequestMapping("/")
    public String hello() {
        return "Answer from Foo: " + restTemplate.getForEntity("http://foo-service/hello", String.class).getBody();
    }
}
