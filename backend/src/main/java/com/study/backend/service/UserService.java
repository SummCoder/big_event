package com.study.backend.service;

import com.study.backend.pojo.User;

/**
 * @author SummCoder
 * @desc 用户相关的Service接口
 * @date 2024/3/10 15:30
 */
public interface UserService {
    User findByUserName(String username);

    void register(String username, String password);

    void update(User user);

    void updateAvatar(String avatarUrl);

    void updatePwd(String newPwd);
}
