package com.company.controller;

import com.company.entity.Employee;
import com.company.service.EmployeeRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yaochunguang
 * @date: 2020-12-31 16:36
 * @description: handler
 **/
@RestController
public class EmployeeFeignHandler {

    @Autowired
    private EmployeeRemoteService employeeRemoteService;

    @RequestMapping("/feign/consumer/get/emp")
    public Employee getEmployeeRemote() {
        return employeeRemoteService.getEmployeeRemote();
    }
}
