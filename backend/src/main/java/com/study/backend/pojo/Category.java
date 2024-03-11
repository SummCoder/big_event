package com.study.backend.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author SummCoder
 * @desc 实体类Category
 * @date 2024/3/10 15:03
 */

@Data
public class Category {
    private Integer id;
    private String categoryName;
    private String categoryAlias;
    private Integer createUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
