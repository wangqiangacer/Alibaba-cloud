package com.jacken.hellospringcloudalibabanacosconsumerfeign.feign.feignclient;

import com.jacken.hellospringcloudalibabadependences.entity.User;
import com.jacken.hellospringcloudalibabanacosconsumerfeign.feign.NacosProviderHyxtrix;
import com.jacken.hellospringcloudalibabanacosconsumerfeign.feign.UserFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 13:52
 */
@FeignClient(value = "nacos-provider",fallback = UserFeignFallBack.class)
public interface UserFeignClient {


    @RequestMapping("/user/save")
    void  save(@RequestBody User user);
}
