package com.example.generator.controller;

import com.example.generator.entity.StatusT;
import com.example.generator.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.corba.se.spi.orbutil.fsm.Guard;
import com.sun.java.browser.plugin2.liveconnect.v1.Result;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.spi.DirStateFactory;
import java.util.List;

/**
 * @Author: xiong
 * @Date: 2020/10/23 15:51
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public void test(){
        PageInfo list = testService.getStatus();
        System.out.println(list.getList().size());
    }

    @GetMapping("/test2")
    public void test2(){
        PageHelper.startPage(1,3);
        List<StatusT> list = testService.getStatus2();
        PageInfo pageInfo = new PageInfo(list);
        System.out.println(pageInfo.getList());
    }
}
