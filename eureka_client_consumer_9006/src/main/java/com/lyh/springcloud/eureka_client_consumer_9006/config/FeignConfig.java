package com.lyh.springcloud.eureka_client_consumer_9006.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    /**
     * 配置 Feign 日志级别
     */
    @Bean
    Logger.Level feignLoggerLever() {
        return Logger.Level.FULL;
    }
}
