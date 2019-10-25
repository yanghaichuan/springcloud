package com.yhc.hystrix.common.controller;

import com.yhc.hystrix.common.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    HystrixService hystrixService;


    @RequestMapping(value = "/product/test")
    public String test() {
        return hystrixService.test();
    }

}
