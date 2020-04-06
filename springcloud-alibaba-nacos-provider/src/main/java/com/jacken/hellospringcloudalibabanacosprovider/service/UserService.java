package com.jacken.hellospringcloudalibabanacosprovider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacken.hellospringcloudalibabadependences.entity.User;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 12:07
 */
public interface UserService extends IService<User> {

    void  saveUser(User user);
}
