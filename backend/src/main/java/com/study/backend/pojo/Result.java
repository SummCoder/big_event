package com.study.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author SummCoder
 * @desc 统一响应结果
 * @date 2024/3/10 15:20
 */

@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code; // 状态码，0-成功，1-失败
    private String message; // 提示信息
    private T data; // 响应数据

    public static <E> Result<E> success(E data) {
        return new Result<>(0, "操作成功", data);
    }

    public static Result success() {
        return new Result<>(0, "操作成功", null);
    }

    public static Result error(String message) {
        return new Result<>(1, message, null);
    }
}
