package com.lyh.springcloud.eureka_client_consumer_9002;

import com.lyh.springcloud.customize.CustomizeLoadBalanceRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "EUREKA-CLIENT-PRODUCER", configuration = CustomizeLoadBalanceRule.class)
public class EurekaClientConsumer9002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumer9002Application.class, args);
    }

}
