package com.store.common.annotation.mysql;

import java.lang.annotation.*;

/**
 * 为数据库表提供一些额外操作
 *
 * @author 宫静雨
 * @version v1.0
 * @since 2022-09-13 20:15:08
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TableName {

    /**
     * 数据库表名，默认为实体类的小驼峰命名。
     */
    String value() default "";

    /**
     * 查询时是否添加索引，默认不添加。
     */
    boolean index() default false;

    /**
     * 是否根据实体类生成数据库表，默认不生成。
     */
    boolean generate() default false;

    /**
     * 映射时忽略某些字段，默认不忽略字段。
     */
    String[] excludes() default {};
}
