package com.study.backend.anno;

import com.study.backend.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/24 23:05
 */
@Documented // 元注解
@Target({ElementType.FIELD}) // 元注解
@Constraint(
        validatedBy = {StateValidation.class} // 指定提供校验规则的类
)
@Retention(RetentionPolicy.RUNTIME) // 元注解
public @interface State {
    // 校验失败后信息
    String message() default "state参数的值只能是已发布或者草稿";
    // 指定分组
    Class<?>[] groups() default {};
    // 负载，获取State注解的附加属性
    Class<? extends Payload>[] payload() default {};
}
