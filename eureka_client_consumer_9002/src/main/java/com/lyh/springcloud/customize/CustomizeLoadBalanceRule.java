package com.lyh.springcloud.customize;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomizeLoadBalanceRule {

    @Bean
    public IRule customizeRule() {
        return new RandomRule();
    }
}
