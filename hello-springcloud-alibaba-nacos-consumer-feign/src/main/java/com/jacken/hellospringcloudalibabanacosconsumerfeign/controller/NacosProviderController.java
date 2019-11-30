package com.jacken.hellospringcloudalibabanacosconsumerfeign.controller;


import com.jacken.hellospringcloudalibabanacosconsumerfeign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @Autowired
    private NacosProviderService nacosProviderService;

    @RequestMapping("/echo/{message}")
    public  String echo(@PathVariable("message") String message){
        System.out.println("consumer 获取到的数据是："+nacosProviderService.echo(message));
        return nacosProviderService.echo(message);

    }
}
