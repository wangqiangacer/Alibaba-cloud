package com.jacken.hellospringcloudalibabanacosprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 *
 * 注意:使用分布式配置中心 nacos config 加载配置文件
 * 全局配置文件 加载顺序
 * 1.bootstrap.properties
 * 2.bootstarp.yml
 * 3.application.properties
 * 4.application.yml
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloSpringcloudAlibabaNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringcloudAlibabaNacosProviderApplication.class, args);
    }

}
