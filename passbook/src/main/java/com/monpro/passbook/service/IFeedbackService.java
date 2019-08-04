package com.monpro.passbook.service;

import com.monpro.passbook.vo.Feedback;
import com.monpro.passbook.vo.Response;

/**
 * Created by monpro.
 */
public interface IFeedbackService {

    /**
     * @param feedback {@link Feedback}
     * @return {@link Response}
     * */
    Response createFeedback(Feedback feedback);

    /**
     * @param userId 用户 id
     * @return {@link Response}
     * */
    Response getFeedback(Long userId);
}
