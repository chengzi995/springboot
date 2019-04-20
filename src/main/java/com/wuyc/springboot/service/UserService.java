package com.wuyc.springboot.service;

import com.wuyc.springboot.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    List<User> queryUserByName(String name);
}
