package com.study.backend.controller;

import com.study.backend.pojo.Result;
import com.study.backend.pojo.User;
import com.study.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SummCoder
 * @desc 用户相关请求打到这里
 * @date 2024/3/7 22:01
 */

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        // 查询用户
        User user = userService.findByUserName(username);
        if (user == null) {
            userService.register(username, password);
            return Result.success();
        } else {
            return Result.error("用户名已被占用");
        }
    }
}
