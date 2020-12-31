package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: yaochunguang
 * @date: 2020-12-31 16:20
 * @description: 启动类
 **/
@EnableFeignClients
@SpringBootApplication
public class SpringCloudFeignConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignConsumer.class, args);
    }
}
