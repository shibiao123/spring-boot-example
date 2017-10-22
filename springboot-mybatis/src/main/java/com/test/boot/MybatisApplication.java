package com.test.boot;

import org.springframework.boot.SpringApplication;
import  org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapperScan必须加  为了扫描dao层实例
@MapperScan("com.test.boot.dao")
public class MybatisApplication {

    public static void main(String[] args){
        SpringApplication.run(MybatisApplication.class,args);
    }
}
