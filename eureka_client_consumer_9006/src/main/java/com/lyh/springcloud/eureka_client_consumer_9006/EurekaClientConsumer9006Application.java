package com.lyh.springcloud.eureka_client_consumer_9006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaClientConsumer9006Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumer9006Application.class, args);
    }

}
