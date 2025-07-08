package com.github.whujay.spring.template.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.whujay.spring.template.mapper.entity.AdminUser;
import com.github.whujay.spring.template.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 管理台用户表 前端控制器
 * </p>
 *
 * @author jieli
 * @since 2025-07-08
 */
@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Autowired
    private IAdminUserService iAdminUserService;

    @RequestMapping("/hello")
    public String hello(){
        LambdaQueryWrapper<AdminUser> queryWrapper = Wrappers.lambdaQuery(AdminUser.class).eq(AdminUser::getUsername, "admin");
        List<AdminUser> adminUsers = iAdminUserService.getBaseMapper().selectList(queryWrapper);
        System.out.printf(adminUsers.get(0).toString());
        return "hello";
    }
}
