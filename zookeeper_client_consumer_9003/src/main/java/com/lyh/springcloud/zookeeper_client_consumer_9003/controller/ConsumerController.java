package com.lyh.springcloud.zookeeper_client_consumer_9003.controller;

import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.zookeeper_client_consumer_9003.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {

    // 注意，此处 url 写死的，仅用于演示，实际项目中不能这么干。
//    public static final String PRODUCER_URL = "http://localhost:8001/producer/";
    // 通过服务名 找到  zookeeper 注册中心真实访问的 地址
    public static final String PRODUCER_URL = "http://zookeeper-client-producer";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public Result getUser(@PathVariable Integer id) {
        return restTemplate.getForObject(PRODUCER_URL + "/producer/user/get/" + id, Result.class);
    }

    @PostMapping("/create")
    public Result createUser(@RequestBody User user) {
        return restTemplate.postForObject(PRODUCER_URL + "/producer/user/create", user, Result.class);
    }
}
