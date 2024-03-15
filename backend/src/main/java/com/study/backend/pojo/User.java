package com.study.backend.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author SummCoder
 * @desc 实体类User
 * @date 2024/3/10 15:04
 */

@Data
public class User {
    @NotNull
    private Integer id;
    private String username;
    @JsonIgnore // 转化为json字符串时忽略该信息
    private String password;

    @NotEmpty
    @Pattern(regexp = "^\\S{1,10}$")
    private String nickname;

    @NotEmpty
    @Email
    private String email;
    private String userPic;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
