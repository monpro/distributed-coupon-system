package main.java.com.monpro.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h2>coupon has taken by user</h2>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pass {

    private Long userId;

    /**rowkey of Pass in HBase*/
    private String rowKey;

    /**rowKey of passTemplate in HBase*/
    private String templateId;

    /** token for Pass, -1 if null*/
    private String token;

    /** assignedDate for Pass*/
    private Date assignedDate;

    /** consumer date, not null means consumed*/
    private Date consumerDate;

}
