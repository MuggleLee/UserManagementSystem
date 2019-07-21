package com.microservice.Config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MuggleLee
 * @date 2019/7/22
 */
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> badRequestException(IllegalArgumentException exception){
        Map<String,Object> data  = new HashMap();
        data.put("code", HttpStatus.BAD_REQUEST.value());
        data.put("message",exception.getStackTrace());
        return data;
    }
}
