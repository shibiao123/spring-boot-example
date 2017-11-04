package com.test.spring.service;

public class UseFunctionService {

    private FunctionService functionService;

    public UseFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public void sayHello(String content){
        functionService.sayHello(content);
    }
}
