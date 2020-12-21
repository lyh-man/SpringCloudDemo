package com.lyh.springcloud.zookeeper_client_producer_8006.controller;


import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.zookeeper_client_producer_8006.entity.User;
import com.lyh.springcloud.zookeeper_client_producer_8006.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${spring.application.name}")
    private String hostname;

    @Value("${server.port}")
    private String port;

    @GetMapping("/get/{id}")
    public Result getUser(@PathVariable Integer id) {
        User user = userService.getById(id);
        if (user == null) {
            return Result.error(false, 404, "data not found").data("ip", (hostname + ":" + port));
        }
        return Result.ok(true, 200, "query data success").data("user", user).data("ip", (hostname + ":" + port));
    }

    @PostMapping("/create")
    public Result createUser(@RequestBody User user) {
        boolean result = userService.save(user);
        if (!result) {
            return Result.error(false, 404, "create data error").data("ip", (hostname + ":" + port));
        }
        return Result.ok(true, 200, "create data success").data("ip", (hostname + ":" + port));
    }
}

