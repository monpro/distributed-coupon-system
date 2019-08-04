package com.monpro.passbook.constant;

/**
 * <h1>status of passTemplate</h1>
 * Created by monpro.
 */
public enum PassStatus {

    UNUSED(1, "unused"),
    USED(2, "used"),
    ALL(3, "All");

    /** status code */
    private Integer code;

    /** status desc */
    private String desc;

    PassStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
