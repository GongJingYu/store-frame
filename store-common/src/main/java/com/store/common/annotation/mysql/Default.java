package com.store.common.annotation.mysql;

import java.lang.annotation.*;

/**
 * 只在将 {@link TableName#generate()}设置为 true 时起作用。
 * 给字段提供默认值。会在生成表时，为该字段添加 default 约束。
 *
 * @author 宫静雨
 * @version v1.0
 * @see TableName#generate()
 * @since 2022-09-13 20:42:24
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Default {

    /**
     * 默认值
     */
    String value();

    /**
     * 默认值的类型
     */
    Class<?> type();
}
