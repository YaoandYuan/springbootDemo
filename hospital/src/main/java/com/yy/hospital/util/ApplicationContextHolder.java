package com.yy.hospital.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public static ApplicationContext getCtx() {
        return ctx;
    }

    public static void setCtx(ApplicationContext ctx) {
        ApplicationContextHolder.ctx = ctx;
    }

    public static <T> T getBean(Class<T> tClass){
        return ctx.getBean(tClass);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name){
        return (T)ctx.getBean(name);
    }
}
