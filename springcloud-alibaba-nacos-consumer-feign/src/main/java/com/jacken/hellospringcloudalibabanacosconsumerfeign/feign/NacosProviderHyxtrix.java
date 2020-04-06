package com.jacken.hellospringcloudalibabanacosconsumerfeign.feign;

import com.jacken.hellospringcloudalibabanacosconsumerfeign.feign.feignclient.NacosProviderService;
import org.springframework.stereotype.Component;

@Component
public class NacosProviderHyxtrix implements NacosProviderService {


    @Override
    public String echo(String message) {
        return "请检查你的网络,服务异常！！！";
    }
}
