package com.lyh.springcloud.config_client_9200.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class TestController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/getInfo")
    public String getInfoAndMessage() {
        String result = "";
        if (info != null) {
            return "success " + info + "\n";
        }
        return "error";
    }
}
