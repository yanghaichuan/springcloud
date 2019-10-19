package com.yhc.eureka.client.api;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiServiceImpl implements ApiService {
    @Override
    public String getValue(String id) {
        return "123456";
    }
}
