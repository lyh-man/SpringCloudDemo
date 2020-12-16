package com.lyh.springcloud.eureka_client_producer_8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProducer8003Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProducer8003Application.class, args);
    }

}
