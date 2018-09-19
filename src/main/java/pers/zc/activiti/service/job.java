package pers.zc.activiti.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class job {
    private Logger logger = LoggerFactory.getLogger(job.class);

    @Scheduled(cron = "0/1 * * * * ?")
    public void exec1(){

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"=====》1秒执行");
    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void exec2(){

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"=====》2秒执行");
    }
    @Scheduled(cron = "0/3 * * * * ?")
    public void exec3(){

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"=====》3秒执行");
    }
    @Scheduled(cron = "0/4 * * * * ?")
    public void exec4(){

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"=====》4秒执行");
    }
    @Scheduled(cron = "0/5 * * * * ?")
    public void exec5(){

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"=====》5秒执行");
    }
}
