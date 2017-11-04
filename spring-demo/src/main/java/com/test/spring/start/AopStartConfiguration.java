package com.test.spring.start;

import com.test.spring.configuration.AopConfig;
import com.test.spring.service.DemoAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopStartConfiguration {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotation demoAnnotation = (DemoAnnotation) context.getBean("demoAnnotaion");
        //demoAnnotation.test();
        //demoAnnotation.test1();
        //demoAnnotation.test2();
        demoAnnotation.test3("heo");
    }
}
