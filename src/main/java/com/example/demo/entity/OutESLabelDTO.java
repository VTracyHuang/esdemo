package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * created by huangyating
 *
 * @Date 2020/12/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutESLabelDTO {
    //标签id
    @Field
    private Integer id;
    //标签名
    @Field
    private String fullName;
}
