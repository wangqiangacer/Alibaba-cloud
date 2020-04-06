package com.jacken.hellospringcloudalibabanacosconsumerfeign.feign;

import com.jacken.hellospringcloudalibabadependences.entity.User;
import com.jacken.hellospringcloudalibabanacosconsumerfeign.service.UserFeignClient;
import org.springframework.stereotype.Service;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 13:52
 */
@Service
public class UserFeignFallBack implements UserFeignClient {

    @Override
    public void save(User user) {

    }
}
