package com.lyh.springcloud.config_client_9201.controller;

import com.lyh.springcloud.config_client_9201.service.SleuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sleuth")
public class SleuthController {

    @Autowired
    private SleuthService sleuthService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getInfo")
    public String getInfo() {
        return sleuthService.getInfo() + "current port : " + port;
    }
}