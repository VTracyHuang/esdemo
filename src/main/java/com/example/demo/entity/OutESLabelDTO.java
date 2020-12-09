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
public class OutESLabelDTO {
    //标签id
    private Integer id;
    //标签名
    private String fullName;
}
