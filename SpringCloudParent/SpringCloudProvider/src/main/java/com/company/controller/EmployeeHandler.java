package com.company.controller;

import com.company.entity.Employee;
import com.netflix.client.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: yaochunguang
 * @date: 2020-12-28 19:43
 * @description: 用户测试类
 **/
@RestController
public class EmployeeHandler {

    /*@RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote(HttpServletRequest request) {
        return new Employee(555, "tom555 " + request.getServerPort(), 555.55);
    }*/

    /**
     * 测试feign远程调用
     * @return
     */
    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote() {
        return new Employee(555, "tom555feign", 555.55);
    }
}
