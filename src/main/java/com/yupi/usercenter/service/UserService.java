package com.yupi.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author admin
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-07-07 12:16:03
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取脱敏用户对象
     * @param originUser
     * @return 脱敏后用户对象
     */
    User getSafeyUser(User originUser);
}
