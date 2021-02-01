package com.lyh.springcloud.eureka_client_consumer_9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaClientConsumer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumer9001Application.class, args);
    }

}
