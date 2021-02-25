package com.lyh.springcloud.config_client_9200.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "CONFIG-SERVER")
@Component
public interface SleuthService {
    @GetMapping("/sleuth/getInfo")
    String getInfo();
}
