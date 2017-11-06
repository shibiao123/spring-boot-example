package com.spring.study.bean.configuration;

import com.spring.study.bean.service.FunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shibiao on 2017/11/6.
 */
@Configuration
public class BeanConfiguration {

    //init是在构造方法执行后执行  destroy是在关闭容器前执行
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public FunctionService functionService(){
        return new FunctionService();
    }
}
