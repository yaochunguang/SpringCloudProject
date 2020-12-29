package com.company.controller;

import com.company.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yaochunguang
 * @date: 2020-12-29 10:28
 * @description: 消费端controller
 **/
@RestController
public class HumanResourceHandler {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/get/employee")
    public Employee getEmployeeRemote() {
        // 远程方法的主机地址
        // String host = "http://localhost:1000";
        String host = "http://provider";
        // 调用远程方法的具体URL地址
        String url = "/provider/get/employee/remote";
        return restTemplate.getForObject(host + url, Employee.class);
    }
}
