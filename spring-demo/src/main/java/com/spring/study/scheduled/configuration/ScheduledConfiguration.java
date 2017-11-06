package com.spring.study.scheduled.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.spring.study.scheduled")
//开启定时任务
@EnableScheduling
public class ScheduledConfiguration {
}
