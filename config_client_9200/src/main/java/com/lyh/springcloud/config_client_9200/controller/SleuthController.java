package com.lyh.springcloud.config_client_9200.controller;

import com.lyh.springcloud.config_client_9200.service.SleuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(SleuthController.class);

    @Value("${server.port}")
    private String port;

    @GetMapping("/getInfo")
    public String getInfo() {
        logger.info("test");
        return sleuthService.getInfo() + "current port : " + port;
    }
}