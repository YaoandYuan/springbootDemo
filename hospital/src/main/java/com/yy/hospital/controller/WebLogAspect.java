package com.yy.hospital.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
//定义切面执行顺序
@Order(3)
public class WebLogAspect {

    //定义日志记录器
    Logger logger= LoggerFactory.getLogger(this.getClass());
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.*.*.controller.*.*(..))")
    public void weblog(){

    }

    @Before("weblog()")
    public void dobefore(JoinPoint joinPoint){
        logger.info("前置通知");
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("URL:"+request.getRequestURI().toString());
        logger.info("METHOD:"+request.getMethod());
        logger.info("CLASS_METHOD:"+joinPoint.getSignature().getDeclaringTypeName()
                    +"."+joinPoint.getSignature().getName());
        logger.info("ARGS:"+ Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret",pointcut = "weblog()")
    public void doafter(Object ret){
        logger.info("后置通知");
        logger.info("RESPONSE:"+ret);
        logger.info("SPEND:"+(System.currentTimeMillis()-startTime.get())+"MS");
    }
}
