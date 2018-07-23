package com.yy.hospital.mapper;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;

@CacheNamespace(implementation = com.yy.hospital.util.RedisCache.class)
public interface RegistrationMapper {

    //查询今天指定科室的挂号人数
    int getToday(@Param("deid") Integer deid);
}
