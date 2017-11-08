package com.pp.plugin.service;


/**
 * Created by shibiao on 2017/11/8.
 */
public class HelloService {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public void sayHello(){
        System.out.println(this.getMsg());
    }
}
