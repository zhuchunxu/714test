package com.zcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class Client1 {
    public static void main(String[] args) {
        System.out.println("服务1启动了..........");
        SpringApplication.run(Client1.class);
    }
}
