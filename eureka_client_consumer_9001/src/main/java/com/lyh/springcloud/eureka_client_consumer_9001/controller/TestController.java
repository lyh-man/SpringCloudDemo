package com.lyh.springcloud.eureka_client_consumer_9001.controller;

import com.lyh.springcloud.eureka_client_consumer_9001.service.ProducerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/consumer2")
@RestController
public class TestController {

    @Autowired
    private ProducerFeignService producerFeignService;

    @GetMapping("/testDefaultFallback/{id}")
    public String testDefaultFallback(@PathVariable Integer id) {
        return producerFeignService.testDefaultFallback(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return producerFeignService.hello();
    }
}
