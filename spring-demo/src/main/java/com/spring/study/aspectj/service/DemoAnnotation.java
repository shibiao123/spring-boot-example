package com.spring.study.aspectj.service;

import com.spring.study.aspectj.newAnnotation.Action;
import org.springframework.stereotype.Service;

@Service("demoAnnotaion")
public class DemoAnnotation {

    @Action(name="test method")
    public void test(){
        System.out.print(DemoAnnotation.class.getCanonicalName());
    }

    public String test1(){
        return "hello";
    }

    public void test2(){
        throw new RuntimeException("跑出了异常");
    }

    public String test3(String content){
        return "test3 start running";
    }
}
