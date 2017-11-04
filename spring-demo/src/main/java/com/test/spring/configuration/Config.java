package com.test.spring.configuration;

import com.test.spring.service.FunctionService;
import com.test.spring.service.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//此注解相当于spring容器的<beans>  容器的上下文
@Configuration
public class Config {

    //bean注解一般在@Configuration配置类中声明  一般用作配置数据库
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService(functionService());
        return useFunctionService;
    }
}
