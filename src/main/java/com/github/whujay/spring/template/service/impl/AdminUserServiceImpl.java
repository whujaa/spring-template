package com.github.whujay.spring.template.service.impl;

import com.github.whujay.spring.template.mapper.entity.AdminUser;
import com.github.whujay.spring.template.mapper.AdminUserMapper;
import com.github.whujay.spring.template.service.IAdminUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理台用户表 服务实现类
 * </p>
 *
 * @author jieli
 * @since 2025-07-08
 */
@Service
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUser> implements IAdminUserService {

}
