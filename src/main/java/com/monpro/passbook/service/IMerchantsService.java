package com.monpro.passbook.service;

import com.monpro.passbook.ValueObject.CreateMerchantsRequest;
import com.monpro.passbook.ValueObject.PassTemplete;
import com.monpro.passbook.ValueObject.Response;

import javax.persistence.Entity;

/**
 * <h1>interface to merchants service</h1>
 */
public interface IMerchantsService {

    /**
     * <h2>Create merchants service</h2>
     * @param request {@link CreateMerchantsRequest}
     * @return {@link Response}
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * build merchants according to id
     * @param id
     * @return
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * drop coupon
     * @param templete
     * @return
     */
    Response dropPassTemplate(PassTemplete templete);

}
