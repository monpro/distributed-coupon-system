package com.monpro.passbook.vo;

import com.monpro.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>用户领取的优惠券信息</h1>
 * Created by monpro.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassInfo {

    /** 优惠券 */
    private Pass pass;

    /** 优惠券模板 */
    private PassTemplate passTemplate;

    /** 优惠券对应的商户 */
    private Merchants merchants;
}
