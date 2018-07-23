package com.yy.hospital;

import com.yy.hospital.domain.Admins;
import com.yy.hospital.mapper.AdminsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminsTest {

    @Autowired
    private AdminsMapper adminsMapper;

    @Test
    public void test(){
        Admins admins=adminsMapper.findByParam("admin","pwd");
        System.out.println(admins.getLoginTime());
    }
}
