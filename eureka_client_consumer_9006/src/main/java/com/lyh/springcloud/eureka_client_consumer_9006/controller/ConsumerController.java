package com.lyh.springcloud.eureka_client_consumer_9006.controller;

import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.eureka_client_consumer_9006.service.ProducerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {
    @Autowired
    private ProducerFeignService producerFeignService;

    @GetMapping("/get/{id}")
    public Result getUser(@PathVariable Integer id) {
        return producerFeignService.getUser(id);
    }

    @GetMapping("/testTimeout")
    public Result testFeignTimeout() {
        return producerFeignService.testFeignTimeout();
    }
}
