package com.spring.study.el.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by shibiao on 2017/11/6.
 */
//spring的bean初始化没有指明类的名称  会自动以类名的驼峰命名作为beanName
@Service
public class FunctionService {
    @Value("functionService name is haha")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
