package com.lyh.springcloud.zookeeper_client_consumer_9004.controller;

import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.zookeeper_client_consumer_9004.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {

    // 注意，此处 url 写死的，仅用于演示，实际项目中不能这么干。
//    public static final String PRODUCER_URL = "http://localhost:8001/producer/";
    // 通过服务名 找到  zookeeper 注册中心真实访问的 地址
    public static final String PRODUCER_URL = "http://zookeeper-client-producer";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public Result discovery() {
        // 获取服务名列表
        List<String> servicesList = discoveryClient.getServices();

        // 根据服务名 获取 每个服务名下的 各个服务的信息
        Map<String, List<ServiceInstance>> map = new HashMap<>();
        servicesList.stream().forEach(service -> {
            map.put(service, discoveryClient.getInstances(service));
        });

        return Result.ok(true, 200, "discovery services success").data("services", map);
    }

    @GetMapping("/get/{id}")
    public Result getUser(@PathVariable Integer id) {
        return restTemplate.getForObject(PRODUCER_URL + "/producer/user/get/" + id, Result.class);
    }

    @PostMapping("/create")
    public Result createUser(@RequestBody User user) {
        return restTemplate.postForObject(PRODUCER_URL + "/producer/user/create", user, Result.class);
    }
}
