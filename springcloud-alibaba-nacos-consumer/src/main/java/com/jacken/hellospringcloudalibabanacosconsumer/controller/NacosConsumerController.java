package com.jacken.hellospringcloudalibabanacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * nacos  实现服务的消费方
 */
@RestController
public class NacosConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private  String appName;


    @RequestMapping("/echo")
    public  String echo(){
        ServiceInstance instance = loadBalancerClient.choose("nacos-provider");
        System.out.println("instance--------->"+instance);
        //获取url从nacos注册中心中
       String url= String.format("http://%s:%s/echo/%s",instance.getHost(),instance.getPort(),appName);
        String s = restTemplate.getForObject(url, String.class);
        System.out.println("远程调用获取的数据是;"+s);
        return restTemplate.getForObject(url,String.class);
    }


}
