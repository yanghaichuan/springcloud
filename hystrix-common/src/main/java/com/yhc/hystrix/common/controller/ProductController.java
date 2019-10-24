package com.yhc.hystrix.common.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}")
    public String getProduct(@PathVariable("id") Long id) {
        if (id.intValue() == 1) {
            throw new RuntimeException("id="+id+"无效");
        }
        return "操作成功";
    }

    public String getFallback(@PathVariable("id") Long id) {
        return "无效ID=" + id;
    }
}
