package com.study.backend.validation;

import com.study.backend.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/24 23:12
 */
public class StateValidation implements ConstraintValidator<State, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 提供校验规则
        if (value == null) {
            return false;
        }
        return value.equals("已发布") || value.equals("草稿");
    }
}
