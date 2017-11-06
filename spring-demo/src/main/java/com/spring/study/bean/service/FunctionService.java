package com.spring.study.bean.service;

/**
 * Created by shibiao on 2017/11/6.
 */
public class FunctionService {
    public FunctionService(){
        super();
        System.out.println("functionService constructor starting...");
    }

    public void init(){
        System.out.println("@Bean init method is execute");
    }

    public void destroy(){
        System.out.println("@Bean destroy method is execute");
    }
}
