package com.yhc.hystrix.common.service;

import com.yhc.eureka.client.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceFallback implements HystrixService {
    @Autowired
    ApiService apiService;

    @Override
    public String test() {

        return apiService.test();
    }
}
