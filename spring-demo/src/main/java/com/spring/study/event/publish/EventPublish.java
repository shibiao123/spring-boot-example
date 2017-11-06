package com.spring.study.event.publish;

import com.spring.study.event.registryEvent.NewApplicationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by shibiao on 2017/11/6.
 */
//容器发布事件
@Component
public class EventPublish {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new NewApplicationEvent(applicationContext,msg));
    }
}
