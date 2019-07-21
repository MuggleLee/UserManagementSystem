package com.microservice.controller;

import com.microservice.Model.Log.LogAnnotation;
import com.microservice.Model.LoginAppUser;
import com.microservice.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MuggleLee
 * @date 2019/07/21
 */
@Slf4j
@RestController
public class UserConntroller {

    @Autowired
    private UserService userService;

    @LogAnnotation(module = "绑定手机号")
    @PostMapping(value = "/user/binding-phone")
    public void bindingPhone(String phone,String key,String code) throws IllegalAccessException {
        if(StringUtils.isBlank(phone)){
            throw new IllegalAccessException("手机号不能为空");
        }
        if(StringUtils.isBlank(key)){
            throw new IllegalAccessException("key不能为空");
        }
        if(StringUtils.isBlank(code)){
            throw new IllegalAccessException("code不能为空");
        }

//        LoginAppUser loginAppUser =


    }

}
