package com.pp.plugin.config;

import com.pp.plugin.properties.HelloServiceProperties;
import com.pp.plugin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by shibiao on 2017/11/8.
 */
//0 在resources中增加spring.factories文件  用来被扫描  之后会实例化此配置类去自动实例化业务类
@org.springframework.context.annotation.Configuration
//1 使用Configurationproperties引入配置属性类
@EnableConfigurationProperties(HelloServiceProperties.class)
//2 在类路径下有HelloService的类文件
@ConditionalOnClass(HelloService.class)
//3 属性hello能够使用 如果不存在则使用true
@ConditionalOnProperty(prefix = "hello",value = "enabled",matchIfMissing = true)
public class AutoConfiguration {

    //1.1 具体引入配置属性类
    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    //4 当容器中未实例化此bean  才去初始化
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：").append(helloServiceProperties.getName()).append(",年龄：").append(helloServiceProperties.getAge());
        helloService.setMsg(sb.toString());
        return helloService;
    }
}
