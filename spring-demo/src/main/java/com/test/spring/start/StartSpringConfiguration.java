package com.test.spring.start;

import com.test.spring.configuration.Config;
import com.test.spring.service.UseFunctionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.soap.SOAPBinding;

public class StartSpringConfiguration {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UseFunctionService useFunctionService = (UseFunctionService) context.getBean("useFunctionService");
        useFunctionService.sayHello("hello da jia hao");
    }
}
