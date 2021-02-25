package com.lyh.springcloud.config_client_9201.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "CONFIG-CLIENT-9200")
@Component
public interface SleuthService {
    @GetMapping("/sleuth/getInfo")
    String getInfo();
}
