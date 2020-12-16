package com.lyh.springcloud.eureka_server_7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003Application.class, args);
    }

}
