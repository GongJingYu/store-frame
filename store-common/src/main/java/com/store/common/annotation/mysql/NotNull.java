package com.store.common.annotation.mysql;

import java.lang.annotation.*;

/**
 * 只在将 {@link TableName#generate()}设置为 true 时起作用。
 * 代表值不为空。会在生成表时，为该字段添加 not null 约束。
 *
 * @author 宫静雨
 * @version v1.0
 * @see TableName#generate()
 * @since 2022-09-13 20:48:46
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NotNull {
}
