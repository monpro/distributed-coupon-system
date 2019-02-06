package com.monpro.passbook.constant;

public enum TemplateColor {

    RED(1,"red color"),
    GREEN(2,"green color"),
    BLUE(3,"blue color");

    /** color code*/
    private Integer code;

    /** color description*/
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
