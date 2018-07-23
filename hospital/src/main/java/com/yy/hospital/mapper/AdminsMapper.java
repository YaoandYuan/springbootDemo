package com.yy.hospital.mapper;

import com.yy.hospital.domain.Admins;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@CacheNamespace(implementation = com.yy.hospital.util.RedisCache.class)
public interface AdminsMapper  {

    @Select("select * from admins where aexist=1 and aname=#{aname}" +
            "and pwd=#{pwd}")
    Admins findByParam(@Param("aname")String sname,@Param("pwd") String pwd);



}
