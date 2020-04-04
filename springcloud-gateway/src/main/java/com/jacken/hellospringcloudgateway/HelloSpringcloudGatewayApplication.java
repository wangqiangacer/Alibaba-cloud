package com.jacken.hellospringcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.2.2.RELEASE/reference/html/
 * 网关配置的详细文档
 * 使用springgateway作为springcloud服务的网关
 *  可以用做验证登录  权限控制 解决跨域 限流 熔断负载均衡  黑名单白名单拦截
 *  zuul 和getaway的区别?
 *  1.都是微服务网关
 *  --------------------------
 *  路由
 *  谓词 匹配的规则
 *  filters
 *
 *  路由谓词规则
 *  After   Before   Between
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HelloSpringcloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringcloudGatewayApplication.class, args);
    }

}
