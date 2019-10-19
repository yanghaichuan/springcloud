package com.yhc.eureka.client.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.yhc.eureka.client.api"})
public class EurekaClientUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientUserApplication.class, args);
    }

}
