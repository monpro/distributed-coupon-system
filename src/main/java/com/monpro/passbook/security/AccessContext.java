package com.monpro.passbook.security;


import org.springframework.stereotype.Component;

/***
 * <h1>use ThreadLocal to store the token info of every thread</h1>
 */

@Component
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<String>();

    public static ThreadLocal<String> getToken() {
        return token;
    }

    public static void setToken(String tokenString){
        token.set(tokenString);
    }

    public static void clearAccessKey(){
        token.remove();
    }

}
