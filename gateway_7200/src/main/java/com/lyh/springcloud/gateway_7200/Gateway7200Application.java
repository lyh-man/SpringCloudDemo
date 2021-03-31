package com.lyh.springcloud.gateway_7200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway7200Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway7200Application.class, args);
    }

}
