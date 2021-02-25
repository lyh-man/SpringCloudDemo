package com.lyh.springcloud.config_client_9201;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConfigClient9201Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient9201Application.class, args);
    }

}
