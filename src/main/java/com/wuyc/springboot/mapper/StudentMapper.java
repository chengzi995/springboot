package com.wuyc.springboot.mapper;

import com.wuyc.springboot.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student")
    List<Student> findAll();
}
