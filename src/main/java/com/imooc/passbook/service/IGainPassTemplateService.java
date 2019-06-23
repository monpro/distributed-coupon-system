package com.imooc.passbook.service;

import com.imooc.passbook.vo.GainPassTemplateRequest;
import com.imooc.passbook.vo.Response;

/**
 * <h1>用户领取优惠券功能实现</h1>
 * Created by Qinyi.
 */
public interface IGainPassTemplateService {

    /**
     * <h2>用户领取优惠券</h2>
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;
}
