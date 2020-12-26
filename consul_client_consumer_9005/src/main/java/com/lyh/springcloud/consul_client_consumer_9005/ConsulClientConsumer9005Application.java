package com.lyh.springcloud.consul_client_consumer_9005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientConsumer9005Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClientConsumer9005Application.class, args);
    }

}
