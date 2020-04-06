//package com.jacken.hellospringcloudalibabanacosconsumerfeign.config;
//
//import io.seata.spring.annotation.GlobalTransactionScanner;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author wangqiang
// * @version 1.0
// * @date 2020/4/6 21:51
// */
//@Configuration
//public class TransactionScanner {
//    @Value("${spring.application.name}")
//    private  String applicationName;
//    @Bean
//    public GlobalTransactionScanner globalTransactionScanner() {
//        return new GlobalTransactionScanner(applicationName, "my_test_tx_group");
//    }
//}
