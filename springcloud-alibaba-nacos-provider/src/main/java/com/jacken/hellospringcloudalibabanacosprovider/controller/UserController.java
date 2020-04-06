package com.jacken.hellospringcloudalibabanacosprovider.controller;

import com.jacken.hellospringcloudalibabadependences.entity.User;
import com.jacken.hellospringcloudalibabanacosprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 12:14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 保存用户
     * @param user
     */
    @RequestMapping("/save")
    public  void   saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
