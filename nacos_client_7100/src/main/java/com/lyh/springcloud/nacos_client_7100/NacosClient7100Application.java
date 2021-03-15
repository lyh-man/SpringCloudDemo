package com.lyh.springcloud.nacos_client_7100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosClient7100Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosClient7100Application.class, args);
    }

}
