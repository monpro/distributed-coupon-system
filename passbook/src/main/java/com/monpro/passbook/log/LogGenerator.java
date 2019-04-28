package main.java.com.monpro.passbook.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class LogGenerator {

    /**
     * <h2>generate log</h2>
     * @param httpServletRequest {@link HttpServletRequest}
     * @param userId user id
     * @param action  log type
     * @param info  log info, could be null
     */
    public static void genLog(HttpServletRequest httpServletRequest, Long userId, String action, Object info){
        log.info(
                JSON.toJSONString(
                        new LogObject(action, userId, System.currentTimeMillis(), httpServletRequest.getRemoteAddr(),info)
                )
        );
    }

}
