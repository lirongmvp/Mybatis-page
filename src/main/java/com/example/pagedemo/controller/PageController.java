package com.example.pagedemo.controller;


import com.example.pagedemo.pojo.PageResult;
import com.example.pagedemo.service.impl.PageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirong
 * @create 2018/1/1
 * @since 1.0.0
 */
@RestController
public class PageController {
    //private StudentRepository studentRepository;

    @Autowired
    private PageServiceImpl pageService;
    @RequestMapping("/page")
    public PageResult page() {
        PageResult pageResult=pageService.findAll();
        return pageResult;
    }
}
