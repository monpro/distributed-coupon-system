package main.java.com.monpro.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>Error Message</h1>
 * @param <E>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo<E> {

    public static final Integer ERROR = -1;

    private Integer code;

    private String message;

    private String url;

    private E data;
}
