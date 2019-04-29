package com.example.demo2.service.Impl;

import com.example.demo2.dao.UserMapper;
import com.example.demo2.model.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;

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
    @Transactional
    public User getUserById(String userId) {
        HashOperations<String ,String ,User> hashOperations = redisTemplate.opsForHash();
        Boolean isHave = hashOperations.hasKey("userList","user-" + userId);
        if (isHave) {
            System.out.println("从hash缓存中拿shopping");
            User user = hashOperations.get("userList","user-" + userId);
            return user;
        }else {
            System.out.println("从数据库中拿shopping");
            User obj = userMapper.selectByPrimaryKey(userId);
            if (obj != null) {
                hashOperations.put("userList", "user-" + userId,obj);
            }
            return obj;
        }

    }
}
