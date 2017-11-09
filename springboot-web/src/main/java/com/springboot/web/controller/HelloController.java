package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shibiao on 2017/11/9.
 */
@Controller
public class HelloController {

    @RequestMapping("/test")
    public String hello(){
        return "test";
    }
}
