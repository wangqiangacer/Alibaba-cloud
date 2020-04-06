package com.jacken.hellospringcloudalibabanacosprovider.config;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/5 14:20
 * 去除springsecurity登录 验证
 */
@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter {

    @Value("web.security.handlerUlr")
    private  String securityHandlerUrl;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers(securityHandlerUrl).permitAll();
        http.csrf().disable();
    }
}
