package com.jacken.hellospringcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用springgateway作为springcloud服务的网关
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HelloSpringcloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringcloudGatewayApplication.class, args);
    }

}
