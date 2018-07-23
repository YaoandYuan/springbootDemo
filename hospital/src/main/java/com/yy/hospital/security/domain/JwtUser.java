package com.yy.hospital.security.domain;

import com.yy.hospital.domain.Authority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

/*
* spring security 框架服务的用户类
* */
public class JwtUser implements UserDetails {

    private final Integer id;
    private final String username;
    private final String password;
    private final Integer state;
    private final String email;
    private final Date lastPasswordResetDate;
    private final boolean enable;
    private final Date loginTime;
    private final Integer doid;
    private final String by1;
    //授权的角色集合
    private final Collection<? extends GrantedAuthority> authorities;


    public JwtUser(Integer id, String username, String password, Integer state, String email, Date lastPasswordResetDate, boolean enable, Date loginTime, Integer doid, String by1, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.state = state;
        this.email = email;
        this.lastPasswordResetDate = lastPasswordResetDate;
        this.enable = enable;
        this.loginTime = loginTime;
        this.doid = doid;
        this.by1 = by1;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


    public Integer getId() {
        return id;
    }

    public Integer getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public boolean isEnable() {
        return enable;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public Integer getDoid() {
        return doid;
    }

    public String getBy1() {
        return by1;
    }
}
