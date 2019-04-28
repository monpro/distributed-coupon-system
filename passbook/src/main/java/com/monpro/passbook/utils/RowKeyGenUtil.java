package main.java.com.monpro.passbook.utils;

import com.monpro.passbook.vo.Feedback;
import com.monpro.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * <h1>Row Key generating tool</h1>
 */
@Slf4j
public class RowKeyGenUtil {
    /**
     * <h2> generate Row Key according to given PassTemplate</h2>
     * @param  passTemplate
     * @return String RowKey
     */
    public static String genPassTemplateRowKey(PassTemplate passTemplate){
        String passInfo = String.valueOf(passTemplate.getId()) + "_" + passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);
        log.info("genPassTemplateRowKey: {}, {}",passInfo,rowKey);

        return rowKey;
    }

    public static String genFeedbackRowKey(Feedback feedback){
        return new StringBuilder(String.valueOf(feedback.getUserId())).reverse().toString() + (Long.MAX_VALUE - System.currentTimeMillis());

    }
}
