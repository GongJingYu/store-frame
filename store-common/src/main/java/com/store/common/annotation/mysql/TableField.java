package com.store.common.annotation.mysql;

import java.lang.annotation.*;

/**
 * 为数据库字段提供额外的操作。
 *
 * @author 宫静雨
 * @version v1.0
 * @since 2022-09-13 20:34:52
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TableField {

    /**
     * 数据库字段的名称，默认为实体类字段的小驼峰命名。
     */
    String value() default "";

}
