package com.jacken.hellospringcloudalibabanacosconsumerfeign.feign.feignclient;


import com.jacken.hellospringcloudalibabanacosconsumerfeign.feign.NacosProviderHyxtrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-provider",fallback = NacosProviderHyxtrix.class)
@Component
public interface NacosProviderService {

    @RequestMapping("/echo/{message}")
    String echo(@PathVariable(value = "message") String message);
}
