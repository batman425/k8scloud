package com.batman.k8smybatis.repository;

import com.batman.k8smybatis.model.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}