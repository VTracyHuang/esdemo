package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * created by huangyating
 *
 * @Date 2020/12/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "test")
public class Test {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    //创建时间
    @Field(type = FieldType.Long)
    private Long createTime;
    //组id,双方约定
    @Field(type = FieldType.Keyword)
    private String groupId;
    //标题
    @Field(type = FieldType.Keyword)
    private String title;
    //简介
    @Field(type = FieldType.Keyword)
    private String introduction;
    //唯一键，类型:id
    @Field(type = FieldType.Keyword)
    private String uniqueKey;
}
