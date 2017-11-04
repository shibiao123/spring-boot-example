package com.test.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.test.spring")
//开启aspectj
@EnableAspectJAutoProxy
public class AopConfig {
}
