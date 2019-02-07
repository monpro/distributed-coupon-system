package com.monpro.passbook.ValueObject;


import com.monpro.passbook.constant.ErrorCode;
import com.monpro.passbook.dao.MerchantsDao;
import com.monpro.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h1>coupon object</h1>
 * developed by MonPro
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplete {

    /** belonged merchants id**/
    private Integer id;

    private String title;

    private String summary;

    private String desc;

    /** limit number of  coupons**/
    private Long limit;

    /** whether coupons have token, tokens are stored in redis**/
    private Boolean hasToken;

    /** background color of coupon**/
    private Integer background;

    private Date start;

    private Date end;

    /***
     * Validate whether the merchants existed
     * @param merchantsDao
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao){
        if(merchantsDao.findById(id) == null){
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }


}
