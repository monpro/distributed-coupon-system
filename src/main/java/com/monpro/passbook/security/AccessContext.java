package com.monpro.passbook.security;

/**
 * <h1>Use ThreadLocal to store Token info of every thread individually</h1>
 * Created by monpro.
 */
public class AccessContext {

    private static final ThreadLocal<String> token = new ThreadLocal<String>();

    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenStr) {
        token.set(tokenStr);
    }

    public static void clearAccessKey() {
        token.remove();
    }
}
