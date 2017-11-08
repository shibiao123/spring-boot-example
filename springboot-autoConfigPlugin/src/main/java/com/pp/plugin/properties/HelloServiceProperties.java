package com.pp.plugin.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by shibiao on 2017/11/8.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
