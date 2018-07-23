package com.yy.hospital.controller;

import com.yy.hospital.domain.Admins;
import com.yy.hospital.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
@RequestMapping("/api")
public class AdminsController {

    @Autowired
    private AdminsService adminsService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ResponseEntity<?> login(@RequestParam("aname")String aname,
                                   @RequestParam("pwd")String pwd){

        Admins admins=adminsService.login(aname,pwd);
        if (admins==null){
            return new ResponseEntity<CustomerErrorType>(new
                    CustomerErrorType("用户名或密码错误"),HttpStatus.OK);
        }else {
            return new ResponseEntity<Admins>(admins, HttpStatus.OK);
        }
    }
}
