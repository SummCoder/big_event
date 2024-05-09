package com.study.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author SummCoder
 * @desc 分页查询结果
 * @date 2024/3/24 23:34
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {
    private Long total;
    private List<T> items;
}
