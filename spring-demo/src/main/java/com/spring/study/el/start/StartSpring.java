package com.spring.study.el.start;

import com.spring.study.el.configuration.ElConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shibiao on 2017/11/6.
 */
public class StartSpring {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(ElConfiguration.class);
        ElConfiguration configuration = (ElConfiguration) context.getBean("elConfiguration");
        configuration.outValue();
    }
}
