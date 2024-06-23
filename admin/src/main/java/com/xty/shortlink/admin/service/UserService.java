package com.xty.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xty.shortlink.admin.dao.entity.UserDO;
import com.xty.shortlink.admin.dto.req.UserLoginReqDTO;
import com.xty.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.xty.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.xty.shortlink.admin.dto.resp.UserLoginRespDTO;
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

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 用户名是否存在 True or False
     */
    Boolean hasUsername(String username);

    /**
     * 用户注册
     * @param requestParam 用户注册请求参数
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户信息
     * @param requestParam 修改用户信息请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回响应
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     * @param username 用户名
     * @param token 用户登录凭证
     * @return 是否已登录true or false
     */
    Boolean checkLogin(String username, String token);

    /**
     * 用户退出登录
     * @param username 用户名
     * @param token 用户登录凭证
     */
    void logout(String username, String token);
}
