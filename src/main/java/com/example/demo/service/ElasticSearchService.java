package com.example.demo.service;

import com.example.demo.entity.OutESCourseDTO;
import com.example.demo.util.JsonUtil;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * created by huangyating
 *
 * @Date 2020/12/9
 */
@Service
public class ElasticSearchService {

    @Autowired
    private RestHighLevelClient client;

    public String addData(OutESCourseDTO outESCourseDTO) throws IOException {
        IndexRequest request = new IndexRequest("posts");
        request.id("1");
        String jsonString = JsonUtil.objectToJson(outESCourseDTO);
        request.source(jsonString, XContentType.JSON);
        request.type();
        request.opType(DocWriteRequest.OpType.CREATE);
        IndexResponse indexResponse = client.index(request, RequestOptions.DEFAULT);
        return indexResponse.getId();
    }
}
