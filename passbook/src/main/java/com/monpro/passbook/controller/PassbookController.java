package com.monpro.passbook.controller;

import com.monpro.passbook.log.LogConstants;
import com.monpro.passbook.log.LogGenerator;
import com.monpro.passbook.service.IFeedbackService;
import com.monpro.passbook.service.IGainPassTemplateService;
import com.monpro.passbook.service.IInventoryService;
import com.monpro.passbook.service.IUserPassService;
import com.monpro.passbook.vo.Feedback;
import com.monpro.passbook.vo.GainPassTemplateRequest;
import com.monpro.passbook.vo.Pass;
import com.monpro.passbook.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <h1>Passbook Rest Controller</h1>
 * Created by monpro.
 */
@Slf4j
@RestController
@RequestMapping("/passbook")
public class PassbookController {

    /** user passbook service */
    private final IUserPassService userPassService;

    /** passbook inventory service */
    private final IInventoryService inventoryService;

    /** gainPassTemplateService */
    private final IGainPassTemplateService gainPassTemplateService;

    /** feedback Service */
    private final IFeedbackService feedbackService;

    /** HttpServletRequest */
    private final HttpServletRequest httpServletRequest;

    @Autowired
    public PassbookController(IUserPassService userPassService,
                              IInventoryService inventoryService,
                              IGainPassTemplateService gainPassTemplateService,
                              IFeedbackService feedbackService,
                              HttpServletRequest httpServletRequest) {
        this.userPassService = userPassService;
        this.inventoryService = inventoryService;
        this.gainPassTemplateService = gainPassTemplateService;
        this.feedbackService = feedbackService;
        this.httpServletRequest = httpServletRequest;
    }

    /**
     * <h2>get passTemplate info of user by userId</h2>
     * @param userId
     * @return {@link Response}
     * */
    @ResponseBody
    @GetMapping("/userpassinfo")
    Response userPassInfo(Long userId) throws Exception {

        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstants.ActionName.USER_PASS_INFO,
                null
        );
        return userPassService.getUserPassInfo(userId);
    }

    /**
     * <h2>get used passbook info of user by userId</h2>
     * @param userId
     * @return {@link Response}
     * */
    @ResponseBody
    @GetMapping("userusedpassinfo")
    Response userUsedPassInfo(Long userId) throws Exception {

        LogGenerator.genLog(
                httpServletRequest,
                userId, LogConstants.ActionName.USER_USED_PASS_INFO,
                null
        );
        return userPassService.getUserUsedPassInfo(userId);
    }

    /**
     * <h2>user use passbook</h2>
     * @param pass {@link Pass}
     * @return {@link Response}
     * */
    @ResponseBody
    @PostMapping("/userusepass")
    Response userUsePass(@RequestBody Pass pass) {

        LogGenerator.genLog(
                httpServletRequest,
                pass.getUserId(),
                LogConstants.ActionName.USER_USE_PASS,
                pass
        );
        return userPassService.userUsePass(pass);
    }

    /**
     * <h2>get inventory info</h2>
     * @param userId
     * @return {@link Response}
     * */
    @ResponseBody
    @GetMapping("/inventoryinfo")
    Response inventoryInfo(Long userId) throws Exception {

        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstants.ActionName.INVENTORY_INFO,
                null
        );
        return inventoryService.getInventoryInfo(userId);
    }

    /**
     * <h2>user gain passTemplate</h2>
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * */
    @ResponseBody
    @PostMapping("/gainpasstemplate")
    Response gainPassTemplate(@RequestBody GainPassTemplateRequest request)
            throws Exception {

        LogGenerator.genLog(
                httpServletRequest,
                request.getUserId(),
                LogConstants.ActionName.GAIN_PASS_TEMPLATE,
                request
        );
        return gainPassTemplateService.gainPassTemplate(request);
    }

    /**
     * <h2>use create feecback</h2>
     * @param feedback {@link Feedback}
     * @return {@link Response}
     * */
    @ResponseBody
    @PostMapping("/createfeedback")
    Response createFeedback(@RequestBody Feedback feedback) {

        LogGenerator.genLog(
                httpServletRequest,
                feedback.getUserId(),
                LogConstants.ActionName.CREATE_FEEDBACK,
                feedback
        );
        return feedbackService.createFeedback(feedback);
    }

    /**
     * <h2>uses get feecback</h2>
     * @param userId
     * @return {@link Response}
     * */
    @ResponseBody
    @GetMapping("/getfeedback")
    Response getFeedback(Long userId) {

        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstants.ActionName.GET_FEEDBACK,
                null
        );
        return feedbackService.getFeedback(userId);
    }

    /**
     * <h2>exception </h2>
     * @return {@link Response}
     * */
    @ResponseBody
    @GetMapping("/exception")
    Response exception() throws Exception {
        throw new Exception("Welcome To monpro");
    }
}
