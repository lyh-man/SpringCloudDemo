package com.lyh.springcloud.config_client_9200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClient9200Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient9200Application.class, args);
    }

}
