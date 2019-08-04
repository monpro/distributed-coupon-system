package com.monpro.passbook.vo;

import com.monpro.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>优惠券模板信息</h1>
 * Created by monpro.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplateInfo {

    /** 优惠券模板 */
    private PassTemplate passTemplate;

    /** 优惠券对应的商户 */
    private Merchants merchants;
}
