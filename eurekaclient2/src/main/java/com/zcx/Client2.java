package com.zcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class Client2 {
    public static void main(String[] args) {
        System.out.println("服务2启动了........");
        SpringApplication.run(Client2.class);
    }
}
