package com.imooc.passbook.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * <h1>日志生成器</h1>
 * Created by Qinyi.
 */
@Slf4j
public class LogGenerator {

    /**
     * <h2>生成 log</h2>
     * @param request {@link HttpServletRequest}
     * @param userId 用户 id
     * @param action 日志类型
     * @param info 日志信息, 可以是 null
     * */
    public static void genLog(HttpServletRequest request, Long userId, String action, Object info) {

        log.info(
                JSON.toJSONString(
                        new LogObject(action, userId, System.currentTimeMillis(), request.getRemoteAddr(), info)
                )
        );
    }
}
