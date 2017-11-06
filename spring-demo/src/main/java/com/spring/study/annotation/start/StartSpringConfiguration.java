package com.spring.study.annotation.start;

import com.spring.study.annotation.configuration.Config;
import com.spring.study.annotation.service.UseFunctionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartSpringConfiguration {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UseFunctionService useFunctionService = (UseFunctionService) context.getBean("useFunctionService");
        useFunctionService.sayHello("hello da jia hao");
    }
}
