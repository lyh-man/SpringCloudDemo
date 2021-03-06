package com.lyh.springcloud.eureka_client_consumer_9005.controller;

import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.eureka_client_consumer_9005.consumizeLoadBalance.LoadBalacner;
import com.lyh.springcloud.eureka_client_consumer_9005.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {

    // 注意，此处 url 写死的，仅用于演示，实际项目中不能这么干。
//    public static final String PRODUCER_URL = "http://localhost:8001/producer/";
    // 通过服务名 找到  Eureka 注册中心真实访问的 地址
    public static final String PRODUCER_URL = "http://EUREKA-CLIENT-PRODUCER";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalacner loadBalancer;

    @GetMapping("/loadBalance")
    public Result testLoadBalance() {
        ServiceInstance serviceInstance = loadBalancer.getInstances(discoveryClient.getInstances("EUREKA-CLIENT-PRODUCER"));
        if (serviceInstance == null) {
            return Result.error().message("服务不存在");
        }
        return Result.ok().data("HostAndPort", serviceInstance.getHost() + ":" + serviceInstance.getPort());
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
