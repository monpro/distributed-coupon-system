package com.monpro.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h1>coupon object </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassTemplate {

    private Integer id;

    private String title;

    private String summary;

    private String desc;

    private Long limit;

    private Boolean hasToken;

    /**coupon background color*/
    private Integer background;

    /**coupon start time*/
    private Date start;

    /**coupon end time*/
    private Date end;
}
