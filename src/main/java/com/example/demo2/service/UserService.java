package com.example.demo2.service;

import com.example.demo2.model.User;

public interface UserService {

    public int save(User user);

    public int update(User user);

    public int remove(User user);

    public User getUserById(String userId);

}