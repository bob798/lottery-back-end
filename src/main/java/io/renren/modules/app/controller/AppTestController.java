/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package io.renren.modules.app.controller;


import io.renren.common.utils.R;
import io.renren.lottery.entity.EmployeeEntity;
import io.renren.lottery.service.CompanyService;
import io.renren.lottery.service.EmployeeService;
import io.renren.modules.app.annotation.Login;
import io.renren.modules.app.annotation.LoginUser;
import io.renren.modules.app.vo.SignInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * APP测试接口
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/app")
@Api("APP测试接口")
@Slf4j
public class AppTestController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployeeService employeeService;

    @Login
    @GetMapping("userInfo")
    @ApiOperation("获取用户信息")
    public R userInfo(@LoginUser EmployeeEntity user) {
        return R.ok().put("user", user);
    }

    @Login
    @GetMapping("userId")
    @ApiOperation("获取用户ID")
    public R userInfo(@RequestAttribute("userId") Integer userId) {
        return R.ok().put("userId", userId);
    }

    @GetMapping("notToken")
    @ApiOperation("忽略Token验证测试")
    public R notToken() {
        return R.ok().put("msg", "无需token也能访问。。。");
    }


    @GetMapping("getCompanyInfo/{id}")
    public R getCompanyInfo(@PathVariable("id") Integer id) {
        return R.ok().put("company", companyService.getById(id));
    }

    @GetMapping("getUserList/{id}")
    public R getUserList(@PathVariable("id") Integer companyId) {
        return R.ok().put("userList", employeeService.getUserList(companyId));
    }

    @PostMapping("saveSignInfo")
    public R saveSignInfo(@RequestBody SignInfoVO vo) {
        employeeService.save(EmployeeEntity.builder().companyId(vo.getCompanyId()).name(vo.getName()).build());
        return R.ok();
    }

    public static void main(String[] args) {
    }
}
