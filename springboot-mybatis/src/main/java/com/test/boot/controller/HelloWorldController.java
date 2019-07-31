package com.test.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    private final static Logger log = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("hello")
    public String hello(){
        log.info("进入到hello方法");
        return "hello";
    }
}
