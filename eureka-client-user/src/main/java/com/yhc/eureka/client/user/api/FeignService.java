package com.yhc.eureka.client.user.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client-user")
public interface FeignService {
    @RequestMapping("/getUser")
    String test();
}
