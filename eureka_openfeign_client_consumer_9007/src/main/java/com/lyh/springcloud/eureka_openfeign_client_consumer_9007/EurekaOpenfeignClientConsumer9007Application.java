package com.lyh.springcloud.eureka_openfeign_client_consumer_9007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaOpenfeignClientConsumer9007Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaOpenfeignClientConsumer9007Application.class, args);
    }

}
