package com.study.backend.pojo;

import com.study.backend.anno.State;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;

/**
 * @author SummCoder
 * @desc 实体类Article
 * @date 2024/3/10 15:03
 */

@Data
public class Article {
    private Integer id;
    @NotEmpty
    @Pattern(regexp = "^\\${1,10}$")
    private String title;
    @NotEmpty
    private String content;
    @NotEmpty
    @URL
    private String coverImg;
    @State
    private String state;
    @NotNull
    private Integer categoryId;
    private Integer createUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
