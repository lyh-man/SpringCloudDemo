package com.lyh.springcloud.eureka_client.controller;


import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.eureka_client.entity.User;
import com.lyh.springcloud.eureka_client.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer/user")
@DefaultProperties(defaultFallback = "globalFallBackMethod")
public class UserController {
    @Autowired
    private UserService userService;

    public Result testCircuitBreakerFallBack(@PathVariable Integer id) {
        return Result.ok().message("调用失败， ID 不能为负数");
    }

    @GetMapping("/testCircuitBreaker/{id}")
    @HystrixCommand(fallbackMethod = "testCircuitBreakerFallBack", commandProperties = {
            // 是否开启断路器。默认为 true。
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            // 在一定时间内，请求总数达到了阈值，才有资格进行熔断。默认 20 个请求。
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            // 熔断之后，重新尝试恢复服务调用的时间，在此期间，会执行 fallbackMethod 定义的逻辑。默认 5 秒。
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            // 出错阈值，请求总数超过了阈值，并且调用失败率达到一定比率，会熔断。默认 50%。
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    public Result testCircuitBreaker(@PathVariable Integer id) {
        if (id < 0) {
            throw new RuntimeException("ID 不能为负数");
        }
        return Result.ok().message("调用成功， ID = " + id);
    }

    public Result globalFallBackMethod() {
        return Result.ok().message("系统异常，请稍后再试！！！");
    }

    @GetMapping("/testRuntimeError")
    @HystrixCommand
    public Result testRuntimeError() {
        int temp = 10 / 0;
        return Result.ok();
    }

    public Result testTimeoutReserveCase() {
        return Result.ok().message("当前服务器繁忙，请稍后再试！！！");
    }

    // 定义服务降级策略
    @HystrixCommand(
            // 当请求超时 或者 接口异常时，会调用 fallbackMethod 声明的方法（方法参数要一致）
            fallbackMethod = "testTimeoutReserveCase",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="1500")
            }
    )
    @GetMapping("/testTimeout")
    public Result testTimeout() {
        try {
            Thread.sleep(500);
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

