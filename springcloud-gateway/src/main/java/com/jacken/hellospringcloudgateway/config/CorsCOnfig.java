package com.jacken.hellospringcloudgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/5 16:46
 * 通过网关 做跨域处理
 */

@Configuration
public class CorsConfig {


    @Bean
    public CorsWebFilter corsWebFilter(){
        CorsConfiguration configuration = new CorsConfiguration();
        //允许所有的域名可以访问
        configuration.addAllowedOrigin("*");
        //允许携带
        configuration.setAllowCredentials(true);
        //允许所有的方法可以访问  post get delete
        configuration.addAllowedMethod("*");
        //允许所有的请求头
        configuration.addAllowedHeader("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",configuration);
        return  new CorsWebFilter(source);
    }
}
