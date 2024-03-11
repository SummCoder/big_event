package com.study.backend.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author SummCoder
 * @desc 实体类User
 * @date 2024/3/10 15:04
 */

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String userPic;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
