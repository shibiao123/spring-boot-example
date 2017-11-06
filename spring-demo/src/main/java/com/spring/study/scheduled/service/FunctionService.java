package com.spring.study.scheduled.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class FunctionService {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //使用scheduled来进行使用任务  cron为时间表达式
    @Scheduled(cron = "0/10 * * * * *")
    public void test1(){
        System.out.println("每隔10s 显示时间为：" + format.format(new Date()));
    }
}
