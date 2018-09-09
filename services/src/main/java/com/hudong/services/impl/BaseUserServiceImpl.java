package com.hudong.services.impl;

import com.hudong.dao.BaseUserMapper;
import com.hudong.domain.BaseUser;
import com.hudong.services.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired
    BaseUserMapper baseUserMapper;
    @Override
    public List<BaseUser> getAll() {
        return baseUserMapper.getAll();
    }
}
