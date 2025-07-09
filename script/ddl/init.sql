CREATE TABLE admin_user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '用户唯一标识，主键，自增',
    username VARCHAR(255) NOT NULL UNIQUE COMMENT '用户名，用于登录，唯一',
    password VARCHAR(255) NOT NULL COMMENT '用户密码，建议加密存储',
    email VARCHAR(255) NOT NULL UNIQUE COMMENT '用户邮箱，可用于找回密码等，唯一',
    phone VARCHAR(20) COMMENT '用户联系电话',
    role VARCHAR(50) COMMENT '用户角色，如 super_admin、admin、editor',
    status VARCHAR(50) COMMENT '用户状态，如 active、inactive、locked',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '用户创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '用户信息更新时间',
    last_login_at DATETIME COMMENT '用户最后登录时间'
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
