package com.store.common.annotation.mysql;

import java.lang.annotation.*;

/**
 * @author 宫静雨
 * @version v1.0
 * @since 2022-09-13 20:56:02
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ForeignKey {

    /**
     * 表字段的值
     */
    String value() default "";

    /**
     * 关联表的关联字段
     */
    String references();

    /**
     * 关联表的实体类类型
     */
    Class<?> relation();
}
