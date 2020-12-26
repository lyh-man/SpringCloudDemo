package com.lyh.springcolud.consul_client_producer_8009;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientProducer8009Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClientProducer8009Application.class, args);
    }

}
