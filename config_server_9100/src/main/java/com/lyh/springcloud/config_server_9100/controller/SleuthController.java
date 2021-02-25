package com.lyh.springcloud.config_server_9100.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sleuth")
@RestController
public class SleuthController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getInfo")
    public String getInfo() {
        return port;
    }
}
