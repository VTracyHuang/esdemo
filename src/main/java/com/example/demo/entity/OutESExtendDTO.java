package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2020/12/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutESExtendDTO {

    //封面图链接
    @Field
    private String coverImage;
    //标签
    @Field
    private List<OutESLabelDTO> labelList;
    //浏览量
    @Field
    private Integer browseCount;
    //评分
    @Field
    private Double score;
    //详情页链接
    @Field
    private String url;
}
