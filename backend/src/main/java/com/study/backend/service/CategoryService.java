package com.study.backend.service;

import com.study.backend.pojo.Category;

import java.util.List;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/16 23:36
 */
public interface CategoryService {
    void add(Category category);

    List<Category> list();

    Category findById(Integer id);

    void update(Category category);

    void delete(Integer id);
}
