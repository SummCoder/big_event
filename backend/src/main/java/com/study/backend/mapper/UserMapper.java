package com.study.backend.mapper;

import com.study.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/10 15:42
 */

@Mapper
public interface UserMapper {
    User findByUsername(String username);
}
