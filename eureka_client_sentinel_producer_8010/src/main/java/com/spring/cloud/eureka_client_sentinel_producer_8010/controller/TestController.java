package com.spring.cloud.eureka_client_sentinel_producer_8010.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testSentinel")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
