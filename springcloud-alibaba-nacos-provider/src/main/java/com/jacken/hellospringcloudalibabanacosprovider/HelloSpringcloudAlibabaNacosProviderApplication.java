package com.jacken.hellospringcloudalibabanacosprovider;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


/**
 *
 * 注意:使用分布式配置中心 nacos config 加载配置文件
 * 全局配置文件 加载顺序
 * 1.bootstrap.properties
 * 2.bootstarp.yml
 * 3.application.properties
 * 4.application.yml
 *
 * nacos的集群搭建 1.配置同一个数据源 2. 修改启动的模式 starter.cmd -m cluster 以集群的模式启动
 * 集群的IP地址不能为 127.0.0.1的形式的
 *
 * spring.datasource.platform=mysql
 * db.num=1
 * db.url.0=jdbc:mysql://localhost:3306/test?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&useUnicode=true&useSSL=false&serverTimezone=UTC
 * #db.url.1=jdbc:mysql://11.163.152.9:3306/nacos_devtest?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&useUnicode=true&useSSL=false&serverTimezone=UTC
 * db.user=root
 * db.password=root
 *
 * *******************************
 * 分布式事务的解决方案  seata
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jacken.hellospringcloudalibabanacosprovider.mapper")
public class HelloSpringcloudAlibabaNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringcloudAlibabaNacosProviderApplication.class, args);
    }


}
