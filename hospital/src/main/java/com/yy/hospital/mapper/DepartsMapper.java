package com.yy.hospital.mapper;

import com.yy.hospital.domain.Departs;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@CacheNamespace(implementation = com.yy.hospital.util.RedisCache.class)
public interface DepartsMapper {

    @Select("selest * from departs where deexist=1")
    List<Departs> find();


}
