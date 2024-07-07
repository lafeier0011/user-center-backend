package com.yupi.usercenter.service;

import com.yupi.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author lafeier
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("dogYupi");
        user.setUserAccount("yupi0011");
        user.setAvatarUrl("www.baidu.com");
        user.setGender(0);
        user.setUserPassword("");
        user.setPhone("123");
        user.setEmail("456");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    public void userRegister() {
        String userAccount = "yupi02";
        String usPassword = "12345678";
        String checkPassword = "12345678";
        String planetCode = "2";

        System.out.println("----------------------test");
        long result = userService.userRegister(userAccount, usPassword, checkPassword, planetCode);
        System.out.println(result);
        Assertions.assertEquals(-1, result);

    }
}