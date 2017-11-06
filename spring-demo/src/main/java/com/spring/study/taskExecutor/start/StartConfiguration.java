package com.spring.study.taskExecutor.start;

import com.spring.study.taskExecutor.configuration.TaskExecutorConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.study.taskExecutor.sevice.FunctionService;

/**
 * Created by shibiao on 2017/11/6.
 */
public class StartConfiguration {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfiguration.class);
        FunctionService functionService = (FunctionService) context.getBean("functionService");

        for(int i = 0; i < 10; i++){
            functionService.method1(i);
        }
        for(int i = 0; i < 10; i++){
            functionService.method2(i);
        }
    }
}
