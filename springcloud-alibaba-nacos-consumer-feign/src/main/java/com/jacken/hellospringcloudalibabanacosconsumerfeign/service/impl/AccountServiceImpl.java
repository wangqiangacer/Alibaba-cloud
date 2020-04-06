package com.jacken.hellospringcloudalibabanacosconsumerfeign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacken.hellospringcloudalibabadependences.entity.Account;
import com.jacken.hellospringcloudalibabadependences.entity.User;
import com.jacken.hellospringcloudalibabanacosconsumerfeign.feign.feignclient.UserFeignClient;
import com.jacken.hellospringcloudalibabanacosconsumerfeign.mapper.AccountMapper;
import com.jacken.hellospringcloudalibabanacosconsumerfeign.service.AccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 17:23
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {


    @Autowired
    private  AccountMapper accountMapper;
    @Autowired
    private UserFeignClient userFeignClient;
    @Override
    @GlobalTransactional
    //@Transactional(rollbackFor = Exception.class)
    public void updateAccount(User user) {

        //远程调用
        userFeignClient.save(user);
        Account account = new Account();
        account.setId(3L);
        account.setMoney(10000);
        account.setUserId(19L);
        int i=1/0;
        accountMapper.insert(account);

    }
}
