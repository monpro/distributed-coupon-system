package com.monpro.passbook.vo;

import com.google.common.base.Enums;
import com.monpro.passbook.constant.FeedbackType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>Comment by User</h1>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    private Long userId;

    private String type;

    /**rowKey of passTemplate, -1 if it is comment for app */
    private String templateId;

    private String comment;

    public boolean validate(){
        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class, this.type.toUpperCase()
        ).orNull();

        return !(null == feedbackType || null == comment);
    }


}
