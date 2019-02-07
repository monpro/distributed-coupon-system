package com.monpro.passbook.security;


import com.monpro.passbook.constant.Constants;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 * <h1>intercept every http request</h1>
 */

@Component
public class AuthCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String token = httpServletRequest.getHeader(Constants.TOKEN_STRING);
        if(StringUtils.isEmpty(token)){
            throw new Exception("Header doesn't contain "+ Constants.TOKEN_STRING + "!");
        }

        if(!token.equals(Constants.TOKEN)){
            throw new Exception("Token in header" + Constants.TOKEN + "doesn't match !");
        }
        AccessContext.setToken(token);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        AccessContext.clearAccessKey();
    }
}
