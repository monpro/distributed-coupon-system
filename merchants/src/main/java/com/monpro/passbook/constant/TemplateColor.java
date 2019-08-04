package com.monpro.passbook.constant;

/**
 * Created by monpro.
 */
public enum TemplateColor {

    RED(1, "RED"),
    GREEN(2, "GREEN"),
    BLUE(3, "BLUE");

    /** Color code */
    private Integer code;

    /** Color desc */
    private String color;

    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getColor() {
        return this.color;
    }
}
