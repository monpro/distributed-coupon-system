package com.monpro.passbook.constant;

/**
 * <h2>Enum Error Code</h2>
 * Created by monpro.
 */
public enum ErrorCode {

    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "Merchant name duplicate"),
    EMPTY_LOGO(2, "Merchant logo is Empty"),
    EMPTY_BUSINESS_LICENSE(3, "Merchant business license is empty"),
    ERROR_PHONE(4, "Merchant phone empty"),
    EMPTY_ADDRESS(5, "Merchant address empty"),
    MERCHANTS_NOT_EXIST(6, "merchant is not existed");

    /** Error code */
    private Integer code;

    /** Error desc */
    private String desc;

    ErrorCode(Integer code, String desc) {
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
