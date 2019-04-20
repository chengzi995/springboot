package com.wuyc.springboot.service;

import com.wuyc.springboot.dao.UserDao;
import com.wuyc.springboot.mapper.UserMapper;
import com.wuyc.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> list = this.userDao.findAll();
        return list;
    }

    @Override
    public List<User> queryUserByName(String name) {
        List<User> list = this.userMapper.queryUserByName(name);
        return list;
    }

}
