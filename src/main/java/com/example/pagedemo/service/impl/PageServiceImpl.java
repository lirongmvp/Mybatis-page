package com.example.pagedemo.service.impl;


import com.example.pagedemo.dao.StudentMapper;
import com.example.pagedemo.pojo.PageResult;
import com.example.pagedemo.pojo.Student;
import com.example.pagedemo.service.PageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lirong
 * @create 2018/1/1
 * @since 1.0.0
 */
@Service
public class PageServiceImpl implements PageService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public PageResult findAll() {
        PageHelper.startPage(2,3);
        List<Student> list = studentMapper.findAll();
        PageInfo page = new PageInfo(list);
        long total = page.getTotal();
        PageResult pageResult = new PageResult();
        pageResult.setRows(list);
        pageResult.setTotal((int) total);
        return pageResult;
    }
}
