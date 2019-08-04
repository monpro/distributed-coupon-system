package com.monpro.passbook.security;

import com.monpro.passbook.constant.Constants;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <h1>Authenticate Interceptor</h1>
 * Created by monpro.
 */
@Component
public class AuthCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {

        String token = httpServletRequest.getHeader(Constants.TOKEN_STRING);

        if (StringUtils.isEmpty(token)) {
            throw new Exception("Header lack " + Constants.TOKEN_STRING + "!");
        }

        if (!token.equals(Constants.TOKEN)) {
            throw new Exception("Header " + Constants.TOKEN_STRING + "Error!");
        }

        AccessContext.setToken(token);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        AccessContext.clearAccessKey();
    }
}
