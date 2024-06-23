package com.xty.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 修改用户信息请求参数
 */
@Data
public class UserUpdateReqDTO {
    private String username;

    private String password;

    private String realName;

    private String phone;

    private String mail;

}
