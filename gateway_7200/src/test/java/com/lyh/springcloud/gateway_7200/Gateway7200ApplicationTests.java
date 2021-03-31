package com.lyh.springcloud.gateway_7200;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
class Gateway7200ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(ZonedDateTime.now());
    }

}
