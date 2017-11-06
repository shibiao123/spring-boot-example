package com.spring.study.aspectj.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring.study.aspectj")
//开启aspectj
@EnableAspectJAutoProxy
public class AopConfig {
}
