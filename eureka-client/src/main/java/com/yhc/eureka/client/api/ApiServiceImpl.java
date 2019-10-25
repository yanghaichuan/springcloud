package com.yhc.eureka.client.api;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiServiceImpl implements ApiService {
    @Override
    public String getValue(String id) {
        return "123456";
    }

    @Override
    public String test() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "熔断来了";
    }
}
