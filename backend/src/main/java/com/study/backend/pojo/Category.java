package com.study.backend.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author SummCoder
 * @desc 实体类Category
 * @date 2024/3/10 15:03
 */

@Data
public class Category {
    @NotNull(groups = Update.class)
    private Integer id;
    @NotEmpty(groups = {Update.class, Add.class})
    private String categoryName;
    @NotEmpty(groups = {Update.class, Add.class})
    private String categoryAlias;
    private Integer createUser;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    public interface Add {

    }

    public interface Update {

    }
}
