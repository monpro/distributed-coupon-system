package com.monpro.passbook.service;

import com.monpro.passbook.vo.Pass;
import com.monpro.passbook.vo.Response;

/**
 * <h1>get passTemplate info of users</h1>
 * Created by monpro.
 */
public interface IUserPassService {

    /**
     * <h2>get passTemplate info of users</h2>
     * @param userId 用户 id
     * @return {@link Response}
     * */
    Response getUserPassInfo(Long userId) throws Exception;

    /**
     * <h2>get used passTemplate info of users</h2>
     * @param userId 用户 id
     * @return {@link Response}
     * */
    Response getUserUsedPassInfo(Long userId) throws Exception;

    /**
     * <h2>get all used passTemplate of users</h2>
     * @param userId 用户 id
     * @return {@link Response}
     * */
    Response getUserAllPassInfo(Long userId) throws Exception;

    /**
     * <h2>User use passTemplate</h2>
     * @param pass {@link Pass}
     * @return {@link Response}
     * */
    Response userUsePass(Pass pass);
}
