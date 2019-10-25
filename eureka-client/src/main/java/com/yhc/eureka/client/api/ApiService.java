package com.yhc.eureka.client.api;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface ApiService {
    @RequestMapping(value = "/getValue", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    String getValue(@RequestParam("id") String id);

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    String test();
}
