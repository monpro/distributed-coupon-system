package com.monpro.passbook.service;

import com.alibaba.fastjson.JSON;
import com.monpro.passbook.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <h1>用户服务测试</h1>
 * Created by monpro.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testCreateUser() throws Exception {

        User user = new User();
        user.setBaseInfo(
                new User.BaseInfo("monpro", 10, "m")
        );
        user.setOtherInfo(
                new User.OtherInfo("123456", "sydney")
        );

        System.out.println(JSON.toJSONString(userService.createUser(user)));
    }
}
