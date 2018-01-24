package com.example.pagedemo.dao;


import com.example.pagedemo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lirong
 * @create 2018/1/1
 * @since 1.0.0
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAll();
}
