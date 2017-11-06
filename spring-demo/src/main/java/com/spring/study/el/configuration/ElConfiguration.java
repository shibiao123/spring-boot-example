package com.spring.study.el.configuration;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;


/**
 * Created by shibiao on 2017/11/6.
 */
@Configuration
@ComponentScan(value="com.spring.study.el")
//spring也有规定  对于properties资源的载入  只能放到resource目录下 普通的java目录下识别不到
@PropertySource(value={"classpath:properties/test.properties"})
public class ElConfiguration {
    //注入普通字符串
    @Value("字符串变量值")
    private String str;

    //注入系统参数
    @Value("#{systemProperties['os.name']}")
    private String systemProperties;

    //注入其他@Bean的属性
    @Value("#{functionService.name}")
    private String otherProperty;

    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource urlResource;

    //注入随便的文件内容
    @Value("classpath:properties/test.properties")
    private Resource fileResource;

    //通过配置文件读取属性
    //需要添加@PropertySource和  PropertySourcesPlaceholderConfigurer的@Bean注册
    @Value("${test.name}")
    private String propertyName;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outValue(){
        System.out.println(str);
        System.out.println(systemProperties);
        System.out.println(otherProperty);
        System.out.println(propertyName);
        try{
//            System.out.println(IOUtils.toString(urlResource.getInputStream()));
            System.out.println(IOUtils.toString(fileResource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
