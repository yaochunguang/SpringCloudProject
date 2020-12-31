package com.company.service;

import com.company.entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: yaochunguang
 * @date: 2020-12-31 15:52
 * @description: 用户远程服务
 **/
@FeignClient("provider")
@Component
public interface EmployeeRemoteService {

    /**
     * 远程获取用户信息
     * @return
     */
    @RequestMapping("/provider/get/employee/remote")
    Employee getEmployeeRemote();
}
