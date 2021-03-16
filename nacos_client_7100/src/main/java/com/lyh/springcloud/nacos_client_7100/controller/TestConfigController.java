package com.lyh.springcloud.nacos_client_7100.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/config")
@RestController
@RefreshScope
public class TestConfigController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${config.test-0}")
    private String test0;

    @Value("${config.test-1}")
    private String test1;

    @Value("${config.test-2}")
    private String test2;

    @GetMapping("/test")
    public String test() {
        return test0 + " ---- " + test1 + " ---- " + test2;
    }

    @GetMapping("/info")
    public String getInfo() {
        return configInfo;
    }
}
