package com.kaamoo.companymanagement.util;

import com.kaamoo.companymanagement.transmit.Result;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class CommonUtil {

    public static <T> Result<T> response(BindingResult bindingResult){
        Result<T> result = new Result<>();
        result.setSuccess(true);
        if(bindingResult.hasFieldErrors()){
           result.setSuccess(false);
           StringBuilder message = new StringBuilder();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for(FieldError error : fieldErrors){
                message.append("[").append(error.getField()).append(":").append(error.getDefaultMessage()).append("],");
            }
            String messageStr = message.toString();
            result.setMessage(messageStr.substring(0,messageStr.length()-1));
            return result;
        }
        return result;
    }
}
