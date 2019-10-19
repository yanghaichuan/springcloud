package com.yhc.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class EurekaClientController {
    @RequestMapping("/test")
    public String test(){
        return "client-hello";
    }
}
