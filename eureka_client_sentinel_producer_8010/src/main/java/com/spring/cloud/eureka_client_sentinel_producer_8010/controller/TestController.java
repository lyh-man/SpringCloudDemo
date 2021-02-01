package com.spring.cloud.eureka_client_sentinel_producer_8010.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testSentinel")
public class TestController {

    public String fallback(Integer id, Throwable ex) {
        return ex.getMessage();
    }

    public String defaultFallback(Throwable ex) {
        return ex.getMessage();
    }

    public String blockHandler(BlockException ex) {
        return "block Handler";
    }

    public String blockHandler2(Integer id, BlockException ex) {
        return "block Handler --------- 2";
    }

    @GetMapping("/testBlockHandler")
    @SentinelResource(value = "testBlockHandler", blockHandler = "blockHandler")
    public String testBlockHandler() {
        return "ok";
    }

    @GetMapping("/testFallback/{id}")
    @SentinelResource(value = "testFallback", blockHandler = "blockHandler", fallback = "fallback")
    public String testFallback(@PathVariable Integer id) {
        if (id > 10) {
            throw new RuntimeException("fallback");
        }
        return "ok";
    }

    @GetMapping("/testDefaultFallback/{id}")
    @SentinelResource(value = "testDefaultFallback", blockHandler = "blockHandler2", defaultFallback = "defaultFallback")
    public String testDefaultFallback(@PathVariable Integer id) {
        Logger log = LoggerFactory.getLogger(TestController.class);
        log.info("====================");
        if (id > 10) {
            throw new RuntimeException("defaultFallback");
        }
        return "ok";
    }

    @GetMapping("/hello")
    public String hello() {
        Logger logger = LoggerFactory.getLogger(TestController.class);
        logger.info("===============");
        return "Hello World";
    }

    @GetMapping("/relation")
    public String relation() {
        return "relation";
    }
}
