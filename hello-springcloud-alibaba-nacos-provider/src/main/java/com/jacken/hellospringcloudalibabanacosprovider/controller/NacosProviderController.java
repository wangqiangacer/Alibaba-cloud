package com.jacken.hellospringcloudalibabanacosprovider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @RequestMapping("/echo/{message}")
    public  String echo(@PathVariable(value = "message") String message){
    return "HELLO NACOS"+message;
    }
}
