package com.jacken.hellospringcloudalibabanacosprovider;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jacken.hellospringcloudalibabanacosprovider.entity.User;
import com.jacken.hellospringcloudalibabanacosprovider.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringcloudAlibabaNacosProviderApplication.class)
public class HelloSpringcloudAlibabaNacosProviderApplicationTests {


    @Autowired
    private UserMapper userMapper;
    @Test
   public  void contextLoads() {
        System.err.println(userMapper.selectById(1l));
    }


    @Test
    public  void selectByPage() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("age",18);
        IPage<User> page = userMapper.selectPage(new Page<>(2, 2), wrapper);
        page.getRecords().forEach(System.out::println);
    }


    @Test
    public  void insert() {
        User user = new User();
        user.setAge(34);
        user.setEmail("www.baidu.com");
        user.setName("xiaoming");
        userMapper.insert(user);
    }

}
