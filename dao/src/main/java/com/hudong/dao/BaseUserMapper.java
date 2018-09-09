package com.hudong.dao;

import com.hudong.domain.BaseUser;

import java.util.List;

public interface BaseUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
    List<BaseUser> getAll();
}