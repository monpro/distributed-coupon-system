package com.monpro.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>Command Response Object</h1>
 * Created by monpro.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    /** Error code, return 0 if no errors*/
    private Integer errorCode = 0;

    /** Error message, return "" if no errors */
    private String errorMsg = "";

    /** return data object */
    private Object data;

    /**
     * @param data object of return value
     * */
    public Response(Object data) {
        this.data = data;
    }
}
