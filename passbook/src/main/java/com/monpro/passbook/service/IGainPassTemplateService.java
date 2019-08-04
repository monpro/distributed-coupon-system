package com.monpro.passbook.service;

import com.monpro.passbook.vo.GainPassTemplateRequest;
import com.monpro.passbook.vo.Response;

/**
 * Created by monpro.
 */
public interface IGainPassTemplateService {

    /**
     * <h2>User gain pass template</h2>
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;
}
