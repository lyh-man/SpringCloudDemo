package com.lyh.springcloud.eureka_client.controller;


import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.eureka_client.entity.User;
import com.lyh.springcloud.eureka_client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/testTimeout")
    public Result testTimeout() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @GetMapping("/get/{id}")
    public Result getUser(@PathVariable Integer id) {
        User user = userService.getById(id);
        if (user == null) {
            return Result.error(false, 404, "data not found");
        }
        return Result.ok(true, 200, "query data success").data("user", user);
    }

    @PostMapping("/create")
    public Result createUser(@RequestBody User user) {
        boolean result = userService.save(user);
        if (!result) {
            return Result.error(false, 404, "create data error");
        }
        return Result.ok(true, 200, "create data success");
    }
}

