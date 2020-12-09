package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by huangyating
 *
 * @Date 2020/12/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutESCourseDTO {

    private String id;

    //创建时间
    private Long createTime;
    //组id,双方约定
    private String groupId;
    //标题
    private String title;
    //简介
    private String introduction;
    //唯一键，类型:id
    private String uniqueKey;
    //权限组织id
    private Integer[] authOrgCode;
    //权限用户Id
    private Integer[] authUserId;
    //是否公开 1-公开 0-不公开
    private Integer publicFlag;

    private OutESExtendDTO outESExtendDTO;
}