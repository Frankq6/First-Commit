package com.hello.demo.service.impl;

import com.hello.demo.dao.UserDao;
import com.hello.demo.entity.User;
import com.hello.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.queryUser();
    }

    @Override
    public User getUserById(int id) {
        return userDao.queryUserById(id);
    }
}
