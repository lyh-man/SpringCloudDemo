package com.lyh.springcloud.eureka_client_consumer_9005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaClientConsumer9005Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumer9005Application.class, args);
    }

}
