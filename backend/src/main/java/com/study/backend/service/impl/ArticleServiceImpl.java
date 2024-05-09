package com.study.backend.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.backend.mapper.ArticleMapper;
import com.study.backend.pojo.Article;
import com.study.backend.pojo.PageBean;
import com.study.backend.service.ArticleService;
import com.study.backend.utils.ThreadLocalUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/23 22:59
 */

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    @Override
    public void add(Article article) {
        article.setCreateTime(LocalDateTime.now());
        article.setUpdateTime(LocalDateTime.now());
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("id");
        article.setCreateUser(userId);
        articleMapper.add(article);
    }

    @Override
    public PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state) {
        // 1.创建pageBean对象
        PageBean<Article> pb = new PageBean<>();
        // 2.开启分页查询
        PageHelper.startPage(pageNum, pageSize);
        // 3.调用mapper
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("id");
        List<Article> articles = articleMapper.list(userId, categoryId, state);
        // page中提供了方法，可以获取PageHelper分页查询后得到的记录条数和当前页数据
        Page<Article> p = (Page<Article>) articles;
        pb.setTotal(p.getTotal());
        pb.setItems(p.getResult());
        return pb;
    }
}
