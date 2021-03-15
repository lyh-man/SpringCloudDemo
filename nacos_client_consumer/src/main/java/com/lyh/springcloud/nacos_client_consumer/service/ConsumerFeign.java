package com.lyh.springcloud.nacos_client_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "nacos-client")
public interface ConsumerFeign {

    @RequestMapping("/nacos/info")
    String getInfo();
}
