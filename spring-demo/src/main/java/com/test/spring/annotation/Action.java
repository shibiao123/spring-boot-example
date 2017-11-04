package com.test.spring.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Action {
    //注解的属性要有一个默认值 不然实际使用的时候  编译会报错
    String name() default "";
}
