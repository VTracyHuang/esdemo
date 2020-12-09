package com.example.demo.dao;

import com.example.demo.entity.OutESCourseDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * created by huangyating
 *
 * @Date 2020/12/8
 */
@Component
public interface CourseRepository  extends ElasticsearchRepository<OutESCourseDTO, String> {

    OutESCourseDTO queryOutESCourseDTOById(String id);

}
