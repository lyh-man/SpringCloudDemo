package com.lyh.springcloud.zookeeper_client_consumer_9004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperClientConsumer9004Application {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientConsumer9004Application.class, args);
    }

}
