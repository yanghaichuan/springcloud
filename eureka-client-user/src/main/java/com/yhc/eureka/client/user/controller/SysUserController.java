package com.yhc.eureka.client.user.controller;

import com.yhc.eureka.client.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private ApiService apiService;

    @RequestMapping("/test")
    public String test(){
        return apiService.getValue("8888888");
    }

    @RequestMapping("/hello")
    public String hello(){
        return "122222";
    }
}
