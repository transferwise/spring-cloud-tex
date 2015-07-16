package com.transferwise.fooservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("foo-service")
public interface FooService {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
