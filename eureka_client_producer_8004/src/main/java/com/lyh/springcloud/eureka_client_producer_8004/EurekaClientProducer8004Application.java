package com.lyh.springcloud.eureka_client_producer_8004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProducer8004Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProducer8004Application.class, args);
    }

}
