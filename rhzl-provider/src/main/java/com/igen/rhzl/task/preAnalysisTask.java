package com.igen.rhzl.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/18 14:09
 * @Version 1.0
 */
@Component
public class preAnalysisTask {
    @Scheduled(cron="*/1 * * * * ?")
    public void cronJob(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
