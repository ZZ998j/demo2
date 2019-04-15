package com.example.demo2.service.Impl;

import com.example.demo2.dao.UserMapper;
import com.example.demo2.model.User;
import com.example.demo2.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int remove(User user) {
        return userMapper.deleteByPrimaryKey(user.getUserId());
    }

    @Override
    public User getUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
