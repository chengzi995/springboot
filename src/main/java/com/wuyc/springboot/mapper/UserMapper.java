package com.wuyc.springboot.mapper;

import com.wuyc.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from name like '${value}%'")
    public List<User> queryUserByName(String name);

}
