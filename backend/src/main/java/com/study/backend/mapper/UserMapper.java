package com.study.backend.mapper;

import com.study.backend.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/10 15:42
 */

@Mapper
public interface UserMapper {
    // 根据用户名查询用户
    @Select("select * from user where username=#{username}")
    User findByUsername(String username);

    // 添加用户
    @Insert("insert into user (username, password, create_time, update_time)" +
            " values(#{username}, #{password}, now(), now())")
    void add(String username, String password);

    @Update("update user set nickname=#{nickname}, email=#{email}, update_time=#{updateTime} where id=#{id}")
    void update(User user);
}
