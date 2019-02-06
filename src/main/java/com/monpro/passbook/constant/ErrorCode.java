package com.monpro.passbook.constant;

public enum  ErrorCode {
    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "merchant names are duplicate"),
    EMPTY_LOGO(2, "merchant logo is empty"),
    EMPTY_BUSINESS_LICENSE(3, "merchant license is empty"),
    ERROR_PHONE(4, "merchant mobile number is wrong"),
    EMPTY_ADDRESS(5, "merchant address is empty"),
    MERCHANTS_NOT_EXIST(6, "merchant is not existed");

    /** error code */
    private Integer code;

    private String desc;

    ErrorCode(Integer code, String desc) {
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
