package com.jacken.hellospringcloudalibabanacosconsumerfeign.controller;

import com.jacken.hellospringcloudalibabadependences.entity.User;
import com.jacken.hellospringcloudalibabanacosconsumerfeign.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 17:35
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 保存账户信息
     * @param user
     * @return
     */
    @RequestMapping("/insertAccount")
    public  Boolean insertAccount(@RequestBody User user){
     accountService.updateAccount(user);
     return  true;
    }
}
