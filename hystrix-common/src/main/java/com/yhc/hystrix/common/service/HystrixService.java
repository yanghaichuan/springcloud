package com.yhc.hystrix.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "hystrix-common",fallback = HystrixServiceFallback.class)
public interface HystrixService {
    @RequestMapping(value = "/hystrix/test",method = RequestMethod.GET)
    public String test();
}
