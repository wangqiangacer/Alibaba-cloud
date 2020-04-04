package com.jacken.hellospringcloudalibabanacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloSpringcloudAlibabaNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringcloudAlibabaNacosConsumerApplication.class, args);
    }

}
