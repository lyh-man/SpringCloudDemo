package com.lyh.springcloud.zookeeper_client_producer_8007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperClientProducer8007Application {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientProducer8007Application.class, args);
    }

}
