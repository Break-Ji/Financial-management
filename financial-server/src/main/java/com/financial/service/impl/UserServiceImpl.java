package com.financial.service.impl;

import com.financial.entity.User;
import com.financial.mapper.UserMapper;
import com.financial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public User getNameById(User user) {
        return userMapper.getNameById((user));
    }
}
