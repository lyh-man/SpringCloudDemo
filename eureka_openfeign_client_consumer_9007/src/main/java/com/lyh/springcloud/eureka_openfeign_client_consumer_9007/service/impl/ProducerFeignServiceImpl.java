package com.lyh.springcloud.eureka_openfeign_client_consumer_9007.service.impl;

import com.lyh.springcloud.common.tools.Result;
import com.lyh.springcloud.eureka_openfeign_client_consumer_9007.service.ProducerFeignService;
import org.springframework.stereotype.Component;

@Component
public class ProducerFeignServiceImpl implements ProducerFeignService {
    @Override
    public Result getUser(Integer id) {
        return Result.ok().message("系统异常，请稍后再试 -- 11111111111");
    }

    @Override
    public Result testFeignTimeout() {
        return Result.ok().message("系统异常，请稍后再试 -- 222222222222");
    }

    @Override
    public Result testRuntimeError() {
        return Result.ok().message("系统异常，请稍后再试 -- 333333333333");
    }
}
