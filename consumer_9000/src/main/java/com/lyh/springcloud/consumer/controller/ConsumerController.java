package com.lyh.springcloud.consumer.controller;

import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {

    // 注意，此处 url 写死的，仅用于演示，实际项目中不能这么干。
    public static final String PRODUCER_URL = "http://localhost:8000/producer/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public Result getUser(@PathVariable Integer id) {
        return restTemplate.getForObject(PRODUCER_URL + "/user/get/" + id, Result.class);
    }

    @PostMapping("/create")
    public Result createUser(@RequestBody User user) {
        return restTemplate.postForObject(PRODUCER_URL + "/user/create", user, Result.class);
    }
}
