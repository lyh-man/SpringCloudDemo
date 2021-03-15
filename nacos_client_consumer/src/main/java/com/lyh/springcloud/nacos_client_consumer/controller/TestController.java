package com.lyh.springcloud.nacos_client_consumer.controller;

import com.lyh.springcloud.nacos_client_consumer.service.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/consumer")
@RestController
public class TestController {

    @Autowired
    private ConsumerFeign consumerFeign;

    @RequestMapping("/info")
    public String getInfo() {
        return consumerFeign.getInfo();
    }
}
