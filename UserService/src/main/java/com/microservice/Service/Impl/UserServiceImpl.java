package com.microservice.Service.Impl;

import com.microservice.Model.AppUser;
import com.microservice.Model.LoginAppUser;
import com.microservice.Model.SysRole;
import com.microservice.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

/**
 * @author MuggleLee
 * @description ${description}
 * @date 2019/7/21.
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addAppUser(AppUser appUser) {

    }

    @Override
    public void updateAppUser(AppUser appUser) {

    }

    @Override
    public LoginAppUser findByUserName(String userName) {
        return null;
    }

    @Override
    public AppUser findById(Long id) {
        return null;
    }

    @Override
    public void setRoletToUser(Long id, Set<Long> roleIds) {

    }

    @Override
    public void updatePassword(Long id, String oldPassword, String newPassword) {

    }

    @Override
    public Page<AppUser> findUsers(Map<String, Object> params) {
        return null;
    }

    @Override
    public Set<SysRole> findRolesByUserId(Long id) {
        return null;
    }

    @Override
    public void bindingPhone(Long userId, String phone) {

    }
}
