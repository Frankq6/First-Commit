package com.hello.demo.dao;

import com.hello.demo.entity.User;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    List<User> queryUser();
    User queryUserById(int id);
}
