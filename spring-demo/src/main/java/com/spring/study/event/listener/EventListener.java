package com.spring.study.event.listener;

import com.spring.study.event.registryEvent.NewApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by shibiao on 2017/11/6.
 */
//增加监听器
@Component
public class EventListener implements ApplicationListener<NewApplicationEvent> {

    @Override
    public void onApplicationEvent(NewApplicationEvent newApplicationEvent) {
        String msg = newApplicationEvent.getMsg();
        System.out.println("监听器监听到消息为：" + msg);
    }
}
