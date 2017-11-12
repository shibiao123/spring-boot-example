package com.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by shibiao on 2017/11/9.
 */
@SpringBootApplication
//使用注解式的servlet filter listener需要使用注解去扫描  初始化
@ServletComponentScan
public class SpringBootWebApplicationContext {
    public static void main(String[] args){
        SpringApplication.run(SpringBootWebApplicationContext.class,args);
    }
}
