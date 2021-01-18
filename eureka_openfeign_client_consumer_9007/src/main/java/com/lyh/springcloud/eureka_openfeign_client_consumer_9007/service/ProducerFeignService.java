package com.lyh.springcloud.eureka_openfeign_client_consumer_9007.service;

import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.eureka_openfeign_client_consumer_9007.service.impl.ProducerFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "EUREKA-CLIENT-PRODUCER-8001", fallback = ProducerFeignServiceImpl.class)
@Component
public interface ProducerFeignService {
    @GetMapping("/producer/user/get/{id}")
    Result getUser(@PathVariable Integer id);

    @GetMapping("/producer/user/testTimeout")
    Result testFeignTimeout();

    @GetMapping("/producer/user/testRuntimeError")
    Result testRuntimeError();
}
