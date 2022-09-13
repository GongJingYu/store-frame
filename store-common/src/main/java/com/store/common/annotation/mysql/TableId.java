package com.store.common.annotation.mysql;

import java.lang.annotation.*;

/**
 * 主键，默认为实体类字段的小驼峰命名。
 * 在 {@link TableName#generate()} 为 true 时，会为该字段添加 primary key 约束。
 *
 * @author 宫静雨
 * @version v1.0
 * @see TableName#generate()
 * @since 2022-09-13 20:51:19
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TableId {

    /**
     * 主键的名称
     */
    String value() default "";

}
