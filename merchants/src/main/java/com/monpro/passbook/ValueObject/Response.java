package com.monpro.passbook.ValueObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * <h1>common response object</h1>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    /**return 0 if no error */
    private Integer errorCode = 0;

    /** return "" if no error*/
    private String errorMsg = "";

    /** return object */
    private Object data;

    /**
     * <h2>Response contrustor/h2>
     * @param data
     */
    public Response(Object data){
        this.data = data;
    }

}
