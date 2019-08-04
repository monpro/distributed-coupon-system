package com.monpro.passbook.constant;

/**
 * <h1>feedback type enum</h1>
 * Created by monpro.
 */
public enum FeedbackType {

    PASS("pass", "feedback on passbook"),
    APP("app", "feedback on app");

    /** feedback type code */
    private String code;

    /** feedback type desc */
    private String desc;

    FeedbackType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
