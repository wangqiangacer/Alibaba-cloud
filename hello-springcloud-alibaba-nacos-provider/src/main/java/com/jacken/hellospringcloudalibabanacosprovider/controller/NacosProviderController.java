package com.jacken.hellospringcloudalibabanacosprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分布式配置中心  实时刷新配置文件信息
 * ConfigurableApplicationContext  从全局配置环境中获取
 *
 * nacos 的多环境配置 bootstrp-dev.properites
 * bootstrp-prod.properties
 */
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private  String port;

//    @Value("${name}")
//    private  String name;
//    @Value("${user.name}")
//    private  String username;

    @Autowired
    private ConfigurableApplicationContext applicationContext;



    @RequestMapping("/echo/{message}")
    public  String echo(@PathVariable(value = "message") String message){
        String name = applicationContext.getEnvironment().getProperty("name");
        String username = applicationContext.getEnvironment().getProperty("user.name");

        return "HELLO NACOS"+message+"i am from "+port+"name:"+name+"username:"+username;
    }
}
