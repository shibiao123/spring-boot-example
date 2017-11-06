package com.spring.study.event.registryEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * Created by shibiao on 2017/11/6.
 */
//注册一个新事件
public class NewApplicationEvent extends ApplicationContextEvent {
    private String msg;

    public NewApplicationEvent(ApplicationContext source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
