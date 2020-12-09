package com.example.demo.controller;

import com.example.demo.entity.OutESCourseDTO;
import com.example.demo.entity.OutESExtendDTO;
import com.example.demo.entity.OutESLabelDTO;
import com.example.demo.service.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2020/12/8
 */
@RestController
@RequestMapping("/es")
public class CourseController {

    @Autowired
    private ElasticSearchService elasticSearchService;
    /**
     * 添加
     *
     * @return
     */
    @RequestMapping("/add")
    public String add() throws IOException {
        OutESCourseDTO outESCourseDTO = new OutESCourseDTO();
        OutESExtendDTO outESExtendDTO = new OutESExtendDTO();
        outESCourseDTO.setId("2");
        outESExtendDTO.setBrowseCount(1);
        OutESLabelDTO outESLabelDTO = new OutESLabelDTO();
        outESLabelDTO.setId(1);
        List<OutESLabelDTO> outESLabelDTOS = new ArrayList<>();
        outESLabelDTOS.add(outESLabelDTO);
        outESExtendDTO.setLabelList(outESLabelDTOS);
        outESCourseDTO.setOutESExtendDTO(outESExtendDTO);
        elasticSearchService.addData(outESCourseDTO);
        System.err.println("add a obj");
        return "success";
    }

//    /**
//     * 删除
//     *
//     * @return
//     */
//    @RequestMapping("/delete")
//    public String delete() {
//        OutESCourseDTO outESCourseDTO  = courseRepository.queryOutESCourseDTOById("1");
//        courseRepository.delete(outESCourseDTO);
//        return "success";
//    }
//
//    /**
//     * 局部更新
//     *
//     * @return
//     */
//    @RequestMapping("/update")
//    public String update() {
//        OutESCourseDTO outESCourseDTO = courseRepository.queryOutESCourseDTOById("1");
//        outESCourseDTO.setUniqueKey("111");
//        courseRepository.save(outESCourseDTO);
//        System.err.println("update a obj");
//        return "success";
//    }
//
//    /**
//     * 查询
//     *
//     * @return
//     */
//    @RequestMapping("query")
//    public OutESCourseDTO query() {
//        OutESCourseDTO accountInfo = courseRepository.queryOutESCourseDTOById("1");
//        return accountInfo;
//    }

}
