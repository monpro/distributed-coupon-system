package main.java.com.monpro.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {

    /**action type for log*/
    private String action;

    private Long userId;

    /**current timestamp*/
    private Long timestamp;

    /**ip address for client */
    private String remoteIp;

    /**log info */
    private Object info = null;


}
