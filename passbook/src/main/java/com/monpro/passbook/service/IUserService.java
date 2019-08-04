package com.monpro.passbook.service;

import com.monpro.passbook.vo.Response;
import com.monpro.passbook.vo.User;

/**
 * Created by monpro.
 */
public interface IUserService {

    /**
     * @param user {@link User}
     * @return {@link Response}
     * */
    Response createUser(User user) throws Exception;
}
