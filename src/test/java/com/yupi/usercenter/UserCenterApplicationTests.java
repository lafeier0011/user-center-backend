package com.yupi.usercenter;

import com.yupi.usercenter.mapper.UserMapper;
import com.yupi.usercenter.model.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserCenterApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> userList= userMapper.selectList(null);
        System.out.println(userList);
    }

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }
}
