package com.lyh.springcloud.eureka_client_consumer_9001.service.impl;

import com.lyh.springcloud.eureka_client_consumer_9001.service.ProducerFeignService;
import org.springframework.stereotype.Component;

@Component
public class ProducerFeignServiceImpl implements ProducerFeignService {
    @Override
    public String testDefaultFallback(Integer id) {
        return "系统异常，请稍后重试 --------- 1111111111111";
    }

    @Override
    public String hello() {
        return "系统异常，请稍后重试 --------- 2222222222222";
    }
}
