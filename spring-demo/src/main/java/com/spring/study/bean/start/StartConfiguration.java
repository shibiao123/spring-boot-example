package com.spring.study.bean.start;

import com.spring.study.bean.configuration.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shibiao on 2017/11/6.
 */
public class StartConfiguration {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        context.close();
    }
}
