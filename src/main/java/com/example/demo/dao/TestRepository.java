package com.example.demo.dao;

import com.example.demo.entity.Test;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * created by huangyating
 *
 * @Date 2020/12/8
 */
public interface TestRepository extends ElasticsearchRepository<Test,String> {
}
