package com.spring.study.taskExecutor.sevice;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by shibiao on 2017/11/6.
 */
@Component
public class FunctionService {

    @Async
    public void method1(Integer i){
        System.out.println("method1 执行方法输出数字：" + i);
    }

    public void method2(Integer i){
        System.out.println("method2 执行方法输出数字：" + i);
    }
}
