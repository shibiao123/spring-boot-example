package com.test.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 如果要想在springboot+mybatis中使用事务 操作如下：
 * 1 在启动类增加注解@EnableTransactionManagerment 开启事务管理类自动配置
 * 2 在具体的service中使用@Transactional
 *
 * @EnableTransactionManagerment在启动的时候  会扫描所有的@Transactional
 *
 */

@SpringBootApplication
//mapperScan必须加  为了扫描dao层实例
@MapperScan("com.test.boot.dao")
public class DruidApplication {

    public static void main(String[] args){
        SpringApplication.run(DruidApplication.class,args);
    }
}
