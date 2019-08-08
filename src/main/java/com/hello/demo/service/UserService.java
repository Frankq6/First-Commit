package com.hello.demo.service;

import com.hello.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    User getUserById(int id);
}
