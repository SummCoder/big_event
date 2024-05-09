package com.study.backend.service;

import com.study.backend.pojo.Article;
import com.study.backend.pojo.PageBean;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/23 22:58
 */
public interface ArticleService {
    void add(Article article);

    // 条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
