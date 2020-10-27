package com.example.generator.mapper;

import com.example.generator.entity.StatusT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatusTMapper {
    int insert(StatusT record);

    int insertSelective(StatusT record);

    List<StatusT> selectAll();

}