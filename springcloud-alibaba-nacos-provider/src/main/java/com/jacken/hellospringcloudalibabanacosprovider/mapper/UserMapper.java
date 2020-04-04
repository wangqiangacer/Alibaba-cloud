package com.jacken.hellospringcloudalibabanacosprovider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacken.hellospringcloudalibabanacosprovider.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/4 16:18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
