package com.lyh.springcloud.eureka_client_producer_8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProducer8002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProducer8002Application.class, args);
    }

}
