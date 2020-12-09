package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * created by huangyating
 *
 * @Date 2020/12/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "courses",shards = 3, replicas = 2)
public class OutESCourseDTO {

    @Id
    private String id;

    //创建时间
    @Field
    private Long createTime;
    //组id,双方约定
    @Field
    private String groupId;
    //标题
    @Field
    private String title;
    //简介
    @Field
    private String introduction;
    //唯一键，类型:id
    @Field
    private String uniqueKey;
    //权限组织id
    @Field
    private Integer[] authOrgCode;
    //权限用户Id
    @Field
    private Integer[] authUserId;
    //是否公开 1-公开 0-不公开
    @Field
    private Integer publicFlag;
    @Field
    private OutESExtendDTO outESExtendDTO;
}