package com.lyh.springcloud.zookeeper_client_producer_8005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperClientProducer8005Application {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientProducer8005Application.class, args);
    }

}
