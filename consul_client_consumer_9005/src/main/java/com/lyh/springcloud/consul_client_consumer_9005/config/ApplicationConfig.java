package com.lyh.springcloud.consul_client_consumer_9005.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

    @Bean
    @LoadBalanced // 使用 @LoadBalanced 注解赋予 RestTemplate 负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
