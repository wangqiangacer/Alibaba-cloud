package com.jacken.hellospringcloudalibabanacosconsumerfeign.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacken.hellospringcloudalibabadependences.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 17:24
 */
@Mapper
public interface  AccountMapper extends BaseMapper<Account> {

}
