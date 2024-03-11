package com.study.backend.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author SummCoder
 * @desc 实体类Article
 * @date 2024/3/10 15:03
 */

@Data
public class Article {
    private Integer id;
    private String title;
    private String content;
    private String coverImg;
    private String state;
    private Integer categoryId;
    private Integer createUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
