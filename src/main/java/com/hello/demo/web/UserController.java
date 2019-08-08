package com.hello.demo.web;

import com.hello.demo.entity.User;
import com.hello.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/listuser", method = RequestMethod.GET)
    private Map<String, Object> listUser(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<User> list = userService.getUserList();
        modelMap.put("userlist", list);
        return modelMap;
    }

    @RequestMapping(value="/getuserbyid", method = RequestMethod.GET)
    private Map<String, Object> getUserById(Integer id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        User user = userService.getUserById(id);
        modelMap.put("user", user);
        return modelMap;
    }
}
