package main.java.com.monpro.passbook.constant;

/**
 * <h1>status of coupons</h1>
 */
public enum passStatus {

    UNUSED(1,"unused coupon"),
    USED(2, "used coupon"),
    ALL(3, "all used");

    private Integer code;

    private String desc;

    passStatus(Integer code, String desc) {
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
