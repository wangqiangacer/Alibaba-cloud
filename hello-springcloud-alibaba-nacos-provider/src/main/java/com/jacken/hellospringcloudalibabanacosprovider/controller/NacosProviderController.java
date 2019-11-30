package com.jacken.hellospringcloudalibabanacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private  String port;

    @RequestMapping("/echo/{message}")
    public  String echo(@PathVariable(value = "message") String message){
    return "HELLO NACOS"+message+"i am from "+port;
    }
}
