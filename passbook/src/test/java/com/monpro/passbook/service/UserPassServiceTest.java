package com.monpro.passbook.service;

import com.alibaba.fastjson.JSON;
import com.monpro.passbook.vo.Pass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by monpro.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPassServiceTest extends AbstractServiceTest {

    @Autowired
    private IUserPassService userPassService;

    @Test
    public void testGetUserPassInfo() throws Exception {

        System.out.println(JSON.toJSONString(
                userPassService.getUserPassInfo(userId))
        );
    }

      @Test
    public void testGetUserUsedPassInfo() throws Exception {

        System.out.println(JSON.toJSONString(
                userPassService.getUserUsedPassInfo(userId)
        ));
    }

    @Test
    public void testGetUserAllPassInfo() throws Exception {

        System.out.println(JSON.toJSONString(
                userPassService.getUserAllPassInfo(userId)
        ));
    }

    @Test
    public void testUserUsePass() {

        Pass pass = new Pass();
        pass.setUserId(userId);
        pass.setTemplateId("3617cf73e7a1099097242115042cb7b0");

        System.out.println(JSON.toJSONString(
                userPassService.userUsePass(pass)
        ));
    }
}
