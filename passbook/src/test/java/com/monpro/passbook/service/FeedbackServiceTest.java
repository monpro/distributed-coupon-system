package com.monpro.passbook.service;

import com.alibaba.fastjson.JSON;
import com.monpro.passbook.constant.FeedbackType;
import com.monpro.passbook.vo.Feedback;
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
public class FeedbackServiceTest extends AbstractServiceTest {

    @Autowired
    private IFeedbackService feedbackService;

    @Test
    public void testCreateFeedback() {

        Feedback appFeedback = new Feedback();
        appFeedback.setUserId(userId);
        appFeedback.setType(FeedbackType.APP.getCode());
        appFeedback.setTemplateId("-1");
        appFeedback.setComment("test网学习分布式卡包应用！");

        System.out.println(JSON.toJSONString(
                feedbackService.createFeedback(appFeedback))
        );

        Feedback passFeedback = new Feedback();
        passFeedback.setUserId(userId);
        passFeedback.setType(FeedbackType.PASS.getCode());
        passFeedback.setTemplateId("3617cf73e7a1099097242115042cb7b0");
        passFeedback.setComment("优惠券评论");

        System.out.println(JSON.toJSONString(
                feedbackService.createFeedback(passFeedback)
        ));

    }



    @Test
    public void testGetFeedback() {

        System.out.println(JSON.toJSONString(
                feedbackService.getFeedback(userId))
        );
    }
}
