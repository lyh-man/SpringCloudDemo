package com.lyh.springcloud.config_server_9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer9100Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer9100Application.class, args);
    }

}
