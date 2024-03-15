package com.study.backend.controller;

import com.study.backend.pojo.Result;
import com.study.backend.pojo.User;
import com.study.backend.service.UserService;
import com.study.backend.utils.Md5Util;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
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
@Validated
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{5,16}$")String password) {
        // 查询用户
        User user = userService.findByUserName(username);
        if (user == null) {
            userService.register(username, password);
            return Result.success();
        } else {
            return Result.error("用户名已被占用");
        }
    }

    @PostMapping("/login")
    public Result login(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{5,16}$")String password) {
        // 查询用户
        User user = userService.findByUserName(username);
        // 判断该用户是否存在
        if (user == null) {
            return Result.error("用户名错误");
        }
        // 判断密码是否正确
        if (Md5Util.checkPassword(password, user.getPassword())) {
            return Result.success("");
        }
        return Result.error("密码错误");
    }
}
