package com.lyh.springcloud.nacos_client_7102.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/nacos")
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/info")
    public String getInfo() {
        return name + "-" + port;
    }

    @GetMapping("/discovery")
    public Map<String, List<ServiceInstance>> discovery() {
        // 获取服务名列表
        List<String> servicesList = discoveryClient.getServices();

        // 根据服务名 获取 每个服务名下的 各个服务的信息
        Map<String, List<ServiceInstance>> map = new HashMap<>();
        servicesList.stream().forEach(service -> {
            map.put(service, discoveryClient.getInstances(service));
        });

        return map;
    }
}
