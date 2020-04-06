package com.jacken.hellospringcloudalibabanacosconsumerfeign.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacken.hellospringcloudalibabadependences.entity.Account;
import com.jacken.hellospringcloudalibabadependences.entity.User;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 17:22
 */
public interface AccountService extends IService<Account> {


    void  updateAccount(User user);
}
