package main.java.com.monpro.passbook.advice;

import com.monpro.passbook.vo.ErrorInfo;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
public class GlobalExceptionHandler {

    public ErrorInfo<String> errorHandler(HttpServletRequest request, Exception ex){
        ErrorInfo<String> info = new ErrorInfo<String>();
        info.setCode(ErrorInfo.ERROR);
        info.setMessage(ex.getMessage());
        info.setData("right now there is no data");
        info.setUrl(request.getRequestURL().toString());

        return info;
    }
}
