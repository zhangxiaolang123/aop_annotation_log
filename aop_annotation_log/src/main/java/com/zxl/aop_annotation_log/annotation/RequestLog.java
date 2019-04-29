package com.zxl.aop_annotation_log.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author zxl
 * @date 2019/4/29
 * @Date 2019-04-29 9:09
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestLog {

    /**
     * 请求模块名称
     *
     * @return
     */
    public String module() default "";

    /**
     * 接口详情描述
     *
     * @return
     */
    public String operationDesc() default "";
}