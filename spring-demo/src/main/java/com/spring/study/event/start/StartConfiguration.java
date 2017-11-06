package com.spring.study.event.start;

import com.spring.study.event.configuration.EventConfiguration;
import com.spring.study.event.publish.EventPublish;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shibiao on 2017/11/6.
 */
public class StartConfiguration {
    /**
     * spring新建一个事件的流程：
     * 1 新建一个事件，继承ApplicationEvent
     * 2 新建一个监听器，实现ApplicationListener
     * 3 新建一个容器发布类，引入applicationContext 调用publishEvent进行发布事件
     *
     * 注意：
     * 监听器和容器发布类都要用@Component进行bean注册才能初始化  事件在发布的时候手动new的 所以可以不用bean注册
     * @param args
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfiguration.class);
        EventPublish publish = (EventPublish) context.getBean("eventPublish");
        publish.publish("da jia hao");
    }
}
