package com.example.demo.controller;

import com.example.demo.dao.CourseRepository;
import com.example.demo.dao.TestRepository;
import com.example.demo.entity.OutESCourseDTO;
import com.example.demo.entity.OutESExtendDTO;
import com.example.demo.entity.OutESLabelDTO;
import com.example.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2020/12/8
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestRepository testRepository;
    /**
     * 添加
     *
     * @return
     */
    @RequestMapping("/add")
    public String add() {
        Test test = new Test();
        test.setTitle("测试");
        testRepository.save(test);
        System.err.println("add a obj");
        return "success";
    }

}
