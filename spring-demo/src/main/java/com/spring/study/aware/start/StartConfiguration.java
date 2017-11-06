package com.spring.study.aware.start;

import com.spring.study.aware.awareService.FunctionService;
import com.spring.study.aware.configuration.AwareConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shibiao on 2017/11/6.
 */
public class StartConfiguration {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        FunctionService functionService = (FunctionService) context.getBean("functionService");
        functionService.outPut();
        context.close();
    }
}
