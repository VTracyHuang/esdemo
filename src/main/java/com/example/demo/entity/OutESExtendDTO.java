package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String coverImage;
    //标签
    private List<OutESLabelDTO> labelList;
    //浏览量
    private Integer browseCount;
    //评分
    private Double score;
    //详情页链接
    private String url;
}
