package com.example.ssmspringboot.service.Impl;

import com.example.ssmspringboot.dao.UserMapper;
import com.example.ssmspringboot.domain.User;
import com.example.ssmspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String username) {
        return userMapper.findByUsername(username);
    }


}
