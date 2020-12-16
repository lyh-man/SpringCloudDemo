package com.lyh.springcloud.eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProducer8001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProducer8001Application.class, args);
    }

}
