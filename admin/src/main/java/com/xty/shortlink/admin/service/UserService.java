package com.xty.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xty.shortlink.admin.dao.entity.UserDO;
import com.xty.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {
    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户返回实体
     */

    UserRespDTO getUserByUsername(String username);
}
