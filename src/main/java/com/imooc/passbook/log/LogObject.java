package com.imooc.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>日志对象</h1>
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {

    /** 日志动作类型 */
    private String action;

    /** 用户 id */
    private Long userId;

    /** 当前时间戳 */
    private Long timestamp;

    /** 客户端 ip 地址 */
    private String remoteIp;

    /** 日志信息 */
    private Object info = null;
}
