package com.ljs.demo.Service.Impl;

import com.ljs.demo.Service.UserService;
import com.ljs.demo.pojo.domain.User;
import com.ljs.demo.pojo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
