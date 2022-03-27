package com.zwz.jxone.service.impl;

import com.zwz.jxone.dao.mapper.UserMapper;
import com.zwz.jxone.po.UserPO;
import com.zwz.jxone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;
    @Override
    public UserPO selectById(Integer UId) {
        return userMapper.selectById(UId);
    }
}
