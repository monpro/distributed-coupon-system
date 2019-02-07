package com.monpro.passbook.constant;

/**
 * <h1>enum for feedback</h1>
 */
public enum  FeedbackType {

    PASS(1, "comments for coupon"),
    APP(2, "comments for app");

    private Integer code;

    private String desc;

    FeedbackType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
