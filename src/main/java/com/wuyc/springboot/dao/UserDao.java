package com.wuyc.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wuyc.springboot.pojo.User;

public interface UserDao extends JpaRepository<User,Long> {
}
