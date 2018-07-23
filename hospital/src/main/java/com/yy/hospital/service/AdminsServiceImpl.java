package com.yy.hospital.service;

import com.yy.hospital.domain.Admins;
import com.yy.hospital.mapper.AdminsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("adminsService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly =true)
public class AdminsServiceImpl implements AdminsService {

    @Autowired
    private AdminsMapper adminsMapper;

    @Override
    public Admins login(String aname, String pwd) {
        return adminsMapper.findByParam(aname,pwd);
    }
}
