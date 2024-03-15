package com.study.backend.controller;

import com.study.backend.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/15 22:05
 */

@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping("/list")
    public Result<String> lis(){
        return Result.success("所有文章数据...");
    }
}
