package com.lyh.springcloud.zookeeper_client_producer_8008;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperClientProducer8008Application {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientProducer8008Application.class, args);
    }

}
