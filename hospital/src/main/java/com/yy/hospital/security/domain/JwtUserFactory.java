package com.yy.hospital.security.domain;

import com.yy.hospital.domain.Admins;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public class JwtUserFactory {

    private JwtUserFactory(){}

    public static JwtUser create(Admins user){
        return null;
    }

    /*将查询的用户角色集合转换成security框架授权的角色集合*/
    private static List<GrantedAuthority> mapTo
}
