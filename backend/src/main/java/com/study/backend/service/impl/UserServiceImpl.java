package com.study.backend.service.impl;

import com.study.backend.mapper.UserMapper;
import com.study.backend.pojo.User;
import com.study.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author SummCoder
 * @desc implementation of {@link UserService}
 * @date 2024/3/10 15:31
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public void register(String username, String password) {
        // 加密

        // 添加
    }
}
