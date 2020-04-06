package com.jacken.hellospringcloudalibabanacosprovider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacken.hellospringcloudalibabadependences.entity.User;
import com.jacken.hellospringcloudalibabanacosprovider.mapper.UserMapper;
import com.jacken.hellospringcloudalibabanacosprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 12:12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private  UserMapper userMapper;
    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
