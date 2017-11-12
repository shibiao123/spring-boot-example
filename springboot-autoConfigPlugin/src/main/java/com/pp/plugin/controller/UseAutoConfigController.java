package com.pp.plugin.controller;

import com.pp.plugin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shibiao on 2017/11/8.
 */
@RestController
public class UseAutoConfigController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/test")
    public void test(){
        helloService.sayHello();
    }
}
