package com.example.generator.service;

import ch.qos.logback.core.status.StatusManager;
import com.example.generator.entity.StatusT;
import com.example.generator.mapper.StatusTMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiong
 * @Date: 2020/10/23 15:52
 */
@Service
public class TestService {

    @Autowired
    private StatusTMapper statusTMapper;

    public PageInfo getStatus(){
        PageHelper.startPage(1,3);
        List<StatusT> list = statusTMapper.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    public List<StatusT>  getStatus2(){
        List<StatusT> list = statusTMapper.selectAll();
        return list;
    }

}
