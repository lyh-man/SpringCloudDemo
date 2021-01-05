package com.lyh.springcloud.eureka_client_consumer_9006.service;

import com.lyh.springcloud.common.tools.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "EUREKA-CLIENT-PRODUCER")
@Component
public interface ProducerFeignService {
    @GetMapping("/producer/user/get/{id}")
    Result getUser(@PathVariable Integer id);

    @GetMapping("/producer/user/testTimeout")
    Result testFeignTimeout();
}
