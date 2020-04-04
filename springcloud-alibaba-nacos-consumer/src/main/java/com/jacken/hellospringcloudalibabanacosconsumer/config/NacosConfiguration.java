package com.jacken.hellospringcloudalibabanacosconsumer.config;

import com.netflix.ribbon.Ribbon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 使用ribbon 负载均衡实现远程调用
 */
@Configuration
public class NacosConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
