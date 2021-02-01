package com.lyh.springcloud.eureka_client_consumer_9001.service;

import com.lyh.springcloud.eureka_client_consumer_9001.service.impl.ProducerFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "EUREKA-CLIENT-SENTINEL-PRODUCER-8010", fallback = ProducerFeignServiceImpl.class)
@Component
public interface ProducerFeignService {

    @GetMapping("/testSentinel/testDefaultFallback/{id}")
    String testDefaultFallback(@PathVariable Integer id);

    @GetMapping("/testSentinel/hello")
    String hello();
}
