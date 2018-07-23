package com.yy.hospital.util;

import org.apache.ibatis.cache.Cache;

import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

/*
*使用redis实现Mybatis二级缓存
* */
public class RedisCache implements Cache {

    //定义日志记录器
    private static final Logger logger= LoggerFactory.getLogger(RedisCache.class);
    //缓存对象唯一标识
    private final String id;
    //用于事务性缓存对象
    private static ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    //写入redis的模版对象
    private static RedisTemplate redisTemplate;
    //失效时间
    private static final long EXPRIRE_TIME_IN_MINUT=30;

    public RedisCache(String id){
        if(id==null){
            throw new IllegalArgumentException("缓存对象id不能为空.")
        }
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void putObject(Object o, Object o1) {

    }

    @Override
    public Object getObject(Object o) {
        return null;
    }

    @Override
    public Object removeObject(Object o) {
        try {

        }catch (Throwable t)

        return null;
    }

    @Override
    public void clear() {
        redisTemplate.execute(RedisCallback)collection
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
