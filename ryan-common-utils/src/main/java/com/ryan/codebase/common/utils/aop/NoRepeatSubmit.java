package com.ryan.codebase.common.utils.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ryan
 * @version Id: NoRepeateSubmit, v 0.1 2021/8/4 下午5:51 ryan Exp $
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoRepeatSubmit {

    /**
     * 默认100毫秒
     *
     * @return
     */
    long lockTime() default 100;
}