package com.yy.hospital.logback;

import ch.qos.logback.core.UnsynchronizedAppenderBase;
import org.slf4j.event.LoggingEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Date;

/*
* 将日志信息输出到mgdb实现类*/
@Component
public class MongoDBAppender extends UnsynchronizedAppenderBase<LoggingEvent>
            implements ApplicationContextAware{

    private LogRepository logRepository;

    @Override
    protected void append(LoggingEvent loggingEvent) {

        MyLog myLog = new MyLog();
        myLog.setLevel(loggingEvent.getLevel().toString());
        myLog.setMessage(loggingEvent.getFormattedMessage());
        myLog.setThread(loggingEvent.getThreadName());
        myLog.setTs(new Date());
        logRepository.save(myLog);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        if (applicationContext.getAutowireCapableBeanFactory().getBean(LogRepository.class)!=null){

        }
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
