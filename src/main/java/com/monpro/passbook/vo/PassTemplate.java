package com.monpro.passbook.vo;

import com.monpro.passbook.constant.ErrorCode;
import com.monpro.passbook.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**<h1>Passsbook Object </h1>
 * Created by monpro.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {

    /** merchants id of passbook */
    private Integer id;

    /** passbook title */
    private String title;

    /** passbook summary */
    private String summary;

    /** passbook desc */
    private String desc;

    /** the largest limit number of passbook */
    private Long limit;

    /** whether passbook has Token */
    private Boolean hasToken; // token is stored in Redis Set

    /** background color of passbook */
    private Integer background;

    /** start date of passbook */
    private Date start;

    /** end date of passbook */
    private Date end;

    /**
     * <h2>validate passbook</h2>
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     * */
    public ErrorCode validate(MerchantsDao merchantsDao) {

        if (null == merchantsDao.findById(id)) {
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }

        return ErrorCode.SUCCESS;
    }
}
