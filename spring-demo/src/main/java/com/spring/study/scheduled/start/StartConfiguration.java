package com.spring.study.scheduled.start;

import com.spring.study.scheduled.configuration.ScheduledConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartConfiguration {
    public static void main(String[] args){
       AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(ScheduledConfiguration.class);

    }
}
