package com.study.backend.service.impl;

import com.study.backend.mapper.UserMapper;
import com.study.backend.pojo.User;
import com.study.backend.service.UserService;
import com.study.backend.utils.Md5Util;
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
        String md5String = Md5Util.getMD5String(password);
        // 添加
        userMapper.add(username, md5String);
    }
}
