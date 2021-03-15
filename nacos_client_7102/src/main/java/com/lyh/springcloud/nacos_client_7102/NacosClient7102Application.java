package com.lyh.springcloud.nacos_client_7102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosClient7102Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosClient7102Application.class, args);
    }

}
