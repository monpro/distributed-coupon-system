package com.monpro.passbook.service;

import com.monpro.passbook.vo.Response;

/**
 * <h1>get inventory info: only return those haven't been gained by users</h1>
 * Created by monpro.
 */
public interface IInventoryService {

    /**
     * @param userId
     * @return {@link Response}
     * */
    Response getInventoryInfo(Long userId) throws Exception;
}
