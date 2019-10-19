package com.yhc.eureka.client.user.api.impl;

import com.yhc.eureka.client.user.api.FeignService;
import org.springframework.stereotype.Service;

@Service(value = "feignService")
public class FeignServiceImpl implements FeignService {
    @Override
    public String test() {
        return "feign 这次的是真的来了";
    }
}
