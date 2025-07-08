package com.github.whujay.spring.template.mapper.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 管理台用户表
 * </p>
 *
 * @author jieli
 * @since 2025-07-08
 */
@Getter
@Setter
@ToString
@TableName("admin_user")
public class AdminUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识，主键，自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名，用于登录，唯一
     */
    @TableField("username")
    private String username;

    /**
     * 用户密码，建议加密存储
     */
    @TableField("password")
    private String password;

    /**
     * 用户邮箱，可用于找回密码等，唯一
     */
    @TableField("email")
    private String email;

    /**
     * 用户联系电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户角色，如 super_admin、admin、editor
     */
    @TableField("role")
    private String role;

    /**
     * 用户状态，如 active、inactive、locked
     */
    @TableField("status")
    private String status;

    /**
     * 用户创建时间
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 用户信息更新时间
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;

    /**
     * 用户最后登录时间
     */
    @TableField("last_login_at")
    private LocalDateTime lastLoginAt;
}
